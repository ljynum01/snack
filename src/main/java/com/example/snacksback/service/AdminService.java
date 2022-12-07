package com.example.snacksback.service;

import com.example.snacksback.model.Admin;

import java.util.List;

public interface AdminService {
    public Boolean addAdmin(Admin admin);

    public Boolean deleteAdmin(Integer id);

    public List<Admin> selectAllAdmin(Integer pageNum, Integer pageSize);

    public Boolean updateAdmin(Admin admin);

    public Admin selectById(Integer id);

    public Admin selectByName(String username);
}
