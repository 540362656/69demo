package com.kgc.service;

import com.kgc.pojo.Qualities;

public interface QualitiesService {
    //根据产品id查询 质检结果
    public Qualities getq(Integer productId);
    //修改质检结果
    public int updateq(Qualities qualities);
    //添加质检数据
    public int addq(Integer productId);
}
