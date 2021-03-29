package com.example.swiftmall.dao.product;

import com.example.swiftmall.model.product.Product;

import java.util.List;

public interface ProductDao {

    int insert(Product product);

    int deleteByAttribute(String attribute, String value);

    List<Product> getByAttribute(String attribute, String value);

    int updateByAttribute(String attribute, String value, Product product);



}
