package com.example.snacksback.service;

public interface UserService {

    public Object login(String username, String password);

    public Boolean logout(String username, String password);

    public Boolean MerchantRegister(String username, String password);

    public Boolean ConsumerRegister(String username, String password);

    public Boolean userInexistence(String username);

    public Integer deleteByid(Integer id);
}
