package com.kgc.mapper;

import com.kgc.pojo.Products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductsMapper {
    //分页
    public List<Products>getBypage(Map<String,Object>params);
    public int getCount(Map<String,Object>params);

    //查询所有产品
    public List<Products> allProducts();
    //添加
    public int add(Products products);
    //修改
    public Products selid(Integer id);
    public int update(Products products);
    //删除
    public int del(Integer id);

    //获取产品id最大值
    public int mixid();
}
