package com.kgc.feign.impl;

import com.kgc.feign.ProductsFeign;
import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductsFeignImpl implements ProductsFeign {
    @Override
    public PageUtil<Products> getpage(String productName, Integer pageIndex, Integer pageSize) {
        PageUtil<Products> pageUtil = new PageUtil<>();
        pageUtil.setPageindex(500);
        return pageUtil;
    }

    @Override
    public int add(Products products) {
        return 0;
    }

    @Override
    public Products selid(Integer id) {
        return null;
    }

    @Override
    public int update(Products products) {
        return 0;
    }

    @Override
    public int del(Integer id) {
        return 0;
    }

    @Override
    public List<Products> allProducts() {
        return null;
    }

    @Override
    public int mixid() {
        return 0;
    }
}
