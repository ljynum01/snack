package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.MerchantMapper;
import com.example.snacksback.mapper.UserRoleMapper;
import com.example.snacksback.model.Merchant;
import com.example.snacksback.model.MerchantExample;
import com.example.snacksback.model.UserRole;
import com.example.snacksback.model.UserRoleExample;
import com.example.snacksback.service.MerchantService;
import com.example.snacksback.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Resource
    private MerchantMapper merchantMapper;
    
    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private UserService userService;

    @Override
    public List<Merchant> selectAllMerchant(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Merchant> merchants = merchantMapper.selectByExample(null);
        return merchants;
    }

    @Override
    public Boolean insertOne(Merchant merchant) {
        int insert = merchantMapper.insert(merchant);
        if (insert>0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean deleteById(Integer id) {
        int i = merchantMapper.deleteByPrimaryKey(id);
        if (i>0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateOne(Merchant merchant) {
        Boolean aBoolean = userService.userInexistence(merchant.getSname());
        if (aBoolean) {
            int i = merchantMapper.updateByPrimaryKey(merchant);
            if (i>0) {
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Merchant findById(Integer id) {
        Merchant merchant = merchantMapper.selectByPrimaryKey(id);
        return merchant;
    }

    @Override
    public Merchant findByName(String username) {
        MerchantExample merchantExample = new MerchantExample();
        merchantExample.createCriteria()
                .andSnameEqualTo(username);
        List<Merchant> merchants = merchantMapper.selectByExample(merchantExample);
        return merchants.get(0);
    }

    @Override
    public Boolean update2(Merchant merchant) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(merchant.getOldName());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        userRole.setUsername(merchant.getSname());
        int i = userRoleMapper.updateByPrimaryKeySelective(userRole);

        int i1 = merchantMapper.updateByPrimaryKeySelective(merchant);
        return i + i1 >2;
    }
}
