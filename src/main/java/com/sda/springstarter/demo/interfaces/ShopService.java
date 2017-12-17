package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> getAllShops();
    void saveShop(Shop shop);

}
