package com.example.snacksback;

import com.example.snacksback.mapper.*;
import com.example.snacksback.model.*;
import com.example.snacksback.service.AdminService;
import com.example.snacksback.service.GoodService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SnacksBackApplicationTests {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private MerchantMapper merchantMapper;

    @Resource
    private ConsumerMapper consumerMapper;

    @Resource
    private AdminService adminService;

    @Resource
    private ImageMapper imageMapper;

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private OrderMapper orderMapper;


//    @Test
//    void test() {
//        System.out.println(56465);
//        List<Integer> list = new ArrayList<>();
//        list.add(123);
//        System.out.println(list.get(0));
//        System.out.println(list.size()>0);
//        System.out.println();
//    }
//
//    @Test
//    void test1() {
//        System.out.println(adminMapper.selectByExample(null));
//    }
//
////    @Test
////    void contextLoads() {
////        List<Admin> admins = adminService.selectAllAdmin();
////        admins.forEach(admin -> {
////            System.out.println(admin.toString());
////        });
////    }
//
//    @Test
//    void test22() {
//        MerchantExample merchantExample = new MerchantExample();
//        merchantExample.createCriteria()
//                .andSnameEqualTo("老王")
//                .andSpasswdEqualTo("123456");
//        List<Merchant> merchants = merchantMapper.selectByExample(merchantExample);
//        System.out.println(merchants.size());
//    }
//
//    @Test
//    void test4545() {
//        String username = "ttss";
//        String password = "123456";
//        Consumer consumer = new Consumer();
//        consumer.setUname(username);
//        consumer.setUpasswd(password);
//        int insert = consumerMapper.insert(consumer);
//        System.out.println(insert);
//        UserRole userRole = new UserRole();
//        userRole.setUsername(username);
//        userRole.setRid(2);
//        int insert1 = userRoleMapper.insert(userRole);
//        System.out.println("insert" + insert);
//        System.out.println("insert1" + insert1);
//        System.out.println((insert + insert1) == 2);
//    }
//
//
//    @Test
//    void test56565() {
//        Admin admin = new Admin();
//        admin.setAid(2);
//        admin.setAname("root");
//        int i = adminMapper.updateByPrimaryKeySelective(admin);
//    }
//
//    @Test
//    void test6546() {
//
//        String path3 = System.getProperty("user.dir");
////        D:\Projects\ideaProjects\springBootTraining\snacks-back\src\main\resources\static
////        D:\Projects\ideaProjects\springBootTraining\snacks-back\src\main\resources\static
//        System.out.println(path3);
//    }
//
//    @Test
//    void test65546() {
//        List<String> list = new ArrayList<>();
//        list.add("sss");
//        String s = list.get(0);
//        System.out.println(list.get(0));
//    }
//
//    @Test
//    void test567576() {
//        List<Admin> admins = adminMapper.selectByExample(null);
//    }
//
//    @Test
//    void test656756() {
//        List<Image> images = imageMapper.selectByGid(1);
//        System.out.println(images.size());
//        images.forEach(image -> {
//            System.out.println(image.toString());
//        });
//    }
//
//    @Test
//    void test546565() {
//        List<Goods> goodsWithId = goodsMapper.findAllGoods();
//        goodsWithId.forEach(goods -> {
//            System.out.println(goods.toString());
//        });
////        Goods goods = goodsMapper.selectByPrimaryKey(1);
////        System.out.println(goods.toString());
////        Merchant merchant = merchantMapper.selectByPrimaryKey(1);
////        System.out.println(merchant.toString());
//    }

//    @Test
//    void test565678() {
//        PageHelper.startPage(2, 6);
//        List<Goods> allGoods = goodsMapper.findAllGoods();
//        PageInfo<Goods> pageInfo = new PageInfo<>(allGoods, 2);
//        System.out.println(pageInfo.toString());
//    }

//    @Test
//    void test76878() {
//        Consumer consumer = consumerMapper.selectByPrimaryKey(1);
//        System.out.println(consumer.toString());
//        List<Orders> ordersList = orderMapper.findAll();
//        System.out.println(ordersList.get(0).toString());
//    }

//    @Test
//    void test676757() {
//        List<Orders> orders = orderMapper.findBySidAndStatus(null, 1);
//        orders.forEach(orders1 -> {
//            System.out.println(orders1.toString());
//        });
//    }

//    @Test
//    void test678800() {
//        List<Orders> orders = orderMapper.findBySidAndStatus(2, 0);
//        orders.forEach(order -> {
//            System.out.println(order.toString());
//        });
//    }

//    @Test
//    void test90786870() {
//        List<Image> images = imageMapper.selectByGid(3);
//        images.forEach(image -> {
//            System.out.println(image.toString());
//        });
//    }

//    @Test
//    void test456u996() {
//        long l = System.currentTimeMillis();
//        System.out.println(l);
//    }
}
