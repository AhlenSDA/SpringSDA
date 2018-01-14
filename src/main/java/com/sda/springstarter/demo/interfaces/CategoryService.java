package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategory();
    void saveCategory(Category category);

}
