package com.example.snacksback.service;

import com.example.snacksback.model.Merchant;

import java.util.List;

public interface MerchantService {
    public List<Merchant> selectAllMerchant(Integer pageNum, Integer pageSize);

    public Boolean insertOne(Merchant merchant);

    public Boolean deleteById(Integer id);

    public Boolean updateOne(Merchant merchant);

    public Merchant findById(Integer id);

    public Merchant findByName(String username);

    public Boolean update2(Merchant merchant);
}
