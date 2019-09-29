package com.test.dao;

import com.test.domain.Product;

import java.util.List;
public interface IProductDao {

    public List<Product> findAll();
}
