package com.kgc.controller;

import com.kgc.pojo.Products;
import com.kgc.service.ProductsService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @RequestMapping("/show")
    public PageUtil<Products> getpage(@RequestParam(value = "productName",required = false,defaultValue = "") String productName,
                                      @RequestParam(value = "pageIndex",required = false,defaultValue ="1") Integer pageIndex,
                                      @RequestParam(value = "pageSize",required = false,defaultValue = "3") Integer pageSize){
    return productsService.getpage(productName,pageIndex,pageSize);
    }

    //添加
    @PostMapping("add")
    public int add(Products products) {
        return productsService.add(products);
    }

    //根据id查询
    @RequestMapping("selid/{id}")
    public Products selid(@PathVariable("id") Integer id) {
        return productsService.selid(id);
    }

    //修改
    @RequestMapping("update")
    public int update(@RequestBody Products products) {
        return productsService.update(products);
    }

    //删除
    @RequestMapping("del/{id}")
    public int del(@PathVariable("id") Integer id) {
        return productsService.del(id);
    }

    //查询所有产品
    @RequestMapping("allp")
    public List<Products> allProducts() {
        return productsService.allProducts();
    }


}
