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
}
