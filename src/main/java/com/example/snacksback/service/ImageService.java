package com.example.snacksback.service;

public interface ImageService {
    public Boolean saveImage(String imgUrl, Integer cid);

    public Boolean updateImage(String imgUrl, Integer cid);
}
