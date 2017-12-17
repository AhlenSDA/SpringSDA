package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {



}
