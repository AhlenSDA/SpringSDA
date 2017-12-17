package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.ShopService;
import com.sda.springstarter.demo.model.Shop;
import com.sda.springstarter.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;


    @Override
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    @Override
    public void saveShop(Shop shop) {
        shopRepository.save(shop);
    }
}