package com.kgc.service;

import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;

import java.util.List;

public interface ProductsService {
    public PageUtil<Products> getpage(String productName,Integer pageIndex,Integer pageSize);
    //添加
    public int add(Products products);
    //修改
    public Products selid(Integer id);
    public int update(Products products);
    //删除
    public int del(Integer id);

    //查询所有产品
    public List<Products> allProducts();
    //获取产品id最大值
    public int mixid();
}
