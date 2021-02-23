package com.kgc.service;

import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;

public interface ProductsService {
    public PageUtil<Products> getpage(String productName,Integer pageIndex,Integer pageSize);
}
