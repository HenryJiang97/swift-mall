package com.example.swiftmall.dao.product;

import com.example.swiftmall.model.product.Category;

import java.util.List;

public interface CategoryDao {

    int insert(Category product);

    int deleteByAttribute(String attribute, String value);

    List<Category> getByAttribute(String attribute, String value);

    int updateByAttribute(String attribute, String value, Category product);
}
