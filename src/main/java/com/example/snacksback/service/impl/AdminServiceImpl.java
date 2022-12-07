package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.AdminMapper;
import com.example.snacksback.model.Admin;
import com.example.snacksback.model.AdminExample;
import com.example.snacksback.service.AdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Boolean addAdmin(Admin admin) {
        int insert = adminMapper.insert(admin);
        if (insert>0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteAdmin(Integer aid) {
        int i = adminMapper.deleteByPrimaryKey(aid);
        if (i>0) {
            return true;
        }
        return false;
    }

    @Override
    public List<Admin> selectAllAdmin(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Admin> admins = adminMapper.selectByExample(null);
        return admins;
    }

    @Override
    public Boolean updateAdmin(Admin admin) {
        int i = adminMapper.updateByPrimaryKeySelective(admin);
        if (i>0) {
            return true;
        }
        return false;
    }

    @Override
    public Admin selectById(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public Admin selectByName(String username) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria()
                .andAnameEqualTo(username);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.get(0);
    }
}
