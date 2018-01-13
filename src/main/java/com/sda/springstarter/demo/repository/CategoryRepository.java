package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
