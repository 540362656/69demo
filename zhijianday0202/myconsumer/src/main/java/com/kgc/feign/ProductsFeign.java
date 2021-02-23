package com.kgc.feign;

import com.kgc.feign.impl.ProductsFeignImpl;
import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "myprovider",fallback = ProductsFeignImpl.class)
public interface ProductsFeign {
    @RequestMapping("/page")
    public PageUtil<Products> getpage(@RequestParam(value = "productName",required = false,defaultValue = "") String productName,
                                      @RequestParam("pageIndex") Integer pageIndex,
                                      @RequestParam("pageSize") Integer pageSize);

    //添加
    @RequestMapping("add")
    public int add(@RequestBody Products products);

    //根据id查询
    @RequestMapping("selid/{id}")
    public Products selid(@PathVariable("id") Integer id);

    //修改
    @RequestMapping("update")
    public int update(@RequestBody Products products);

    //删除
    @RequestMapping("del/{id}")
    public int del(@PathVariable("id") Integer id);

    //查询所有产品
    @RequestMapping("allp")
    public List<Products> allProducts();


    @RequestMapping("/maxid")
    public int mixid();
}
