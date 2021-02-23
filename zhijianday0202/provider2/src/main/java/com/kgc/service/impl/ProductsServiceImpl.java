package com.kgc.service.impl;

import com.kgc.mapper.ProductsMapper;
import com.kgc.pojo.Products;
import com.kgc.service.ProductsService;
import com.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductsServiceImpl implements ProductsService {
@Autowired
    ProductsMapper productsMapper;
    @RequestMapping("/page")
    public PageUtil<Products> getpage(@RequestParam(value = "productName",required = false,defaultValue = "") String productName,
                                      @RequestParam("pageIndex") Integer pageIndex,
                                      @RequestParam("pageSize") Integer pageSize) {
        System.out.println("服务者2");
        Map<String,Object>map = new HashMap<>();
        map.put("productName",productName);
        map.put("from",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        //获取当前页数，调用mapper
        int totalcount = productsMapper.getCount(map);
        //获取当前条件的集合，调用mapper
        List<Products> list = productsMapper.getBypage(map);
        //创建分页对象
        PageUtil<Products> page = new PageUtil<>();
        page.setPagesize(pageSize);
        page.setPageindex(pageIndex);
        page.setTotalcount(totalcount);
        page.setList(list);
        return page;
    }
}
