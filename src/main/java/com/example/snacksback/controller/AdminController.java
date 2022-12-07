package com.example.snacksback.controller;

import com.example.snacksback.model.Admin;
import com.example.snacksback.model.UserRole;
import com.example.snacksback.model.UserRoleExample;
import com.example.snacksback.service.AdminService;
import com.example.snacksback.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "管理员接口")
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @Resource
    private UserService userService;

    @ApiOperation("查询所有管理员")
    @GetMapping("/findAll")
    public List<Admin> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "10") Integer pageSize) {
        List<Admin> admins = adminService.selectAllAdmin(pageNum, pageSize);
        return admins;
    }

    @ApiOperation("增加一条管理员记录")
    @PostMapping("/insertOne")
    public Boolean insertOne(@RequestParam("uesrname") String username, @RequestParam("password") String password) {
        Boolean aBoolean1 = userService.userInexistence(username);
        if (aBoolean1) {
            Admin admin = new Admin();
            admin.setAname(username);
            admin.setApasswd(password);
            Boolean aBoolean = adminService.addAdmin(admin);
            return aBoolean;
        }else {
            return false;
        }
    }

    @ApiOperation("insert")
    @PostMapping("/inset")
    public Admin insert(@RequestBody Admin admin) {
        return admin;
    }

    @ApiOperation("删除一条管理员记录")
    @GetMapping("/delete")
    public Boolean deleteOne(@RequestParam("id") Integer id) {
        Boolean aBoolean = adminService.deleteAdmin(id);
        return aBoolean;
    }

    @ApiOperation("更新一条管理员记录")
    @PostMapping("/update")
    public Boolean updateOne(@RequestParam("uesrname") String username, @RequestParam("password") String password) {
        Admin admin = new Admin();
        admin.setAname(username);
        admin.setApasswd(password);
        Boolean aBoolean = adminService.updateAdmin(admin);
        return aBoolean;
    }

    @ApiOperation("根据id查询")
    @GetMapping("findById")
    public Admin findById(@RequestParam("id") Integer id) {
        Admin admin = adminService.selectById(id);
        return admin;
    }

    @ApiOperation("根据用户名查找")
    @GetMapping("findByName")
    public Admin findByName(@RequestParam("username") String username) {
        Admin admin = adminService.selectByName(username);
        return admin;
    }

}
