package com.kgc.service.impl;

import com.kgc.feign.ProductsFeign;
import com.kgc.pojo.Products;
import com.kgc.service.ProductsService;
import com.kgc.service.QualitiesService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
@Autowired
ProductsFeign productsFeign;
    @Autowired
    QualitiesService qualitiesService;


    @Override
    public int mixid() {
        return productsFeign.mixid();
    }
    @Override
    public PageUtil<Products> getpage(String productName, Integer pageIndex, Integer pageSize) {
      return   productsFeign.getpage(productName,pageIndex,pageSize);
    }

    @Override
    public int add(Products products) {
       int count = productsFeign.add(products);
        System.out.println("count="+count);
       int id=this.mixid();//获取产品id
        System.out.println("产品id"+id);
        qualitiesService.addq(id);
        return count;
    }

    @Override
    public Products selid(Integer id) {
        return productsFeign.selid(id);
    }

    @Override
    public int update(Products products) {
        return productsFeign.update(products);
    }

    @Override
    public int del(Integer id) {
        return productsFeign.del(id);
    }

    @Override
    public List<Products> allProducts() {
        return productsFeign.allProducts();
    }




}
