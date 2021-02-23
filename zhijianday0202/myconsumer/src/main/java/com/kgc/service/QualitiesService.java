package com.kgc.service;

import com.kgc.pojo.Qualities;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface QualitiesService {
    //根据产品id查询 质检结果
    public Qualities getq(Integer productId);
    //修改质检结果
    public int updateq(Qualities qualities);
    //添加默认值
    public int addq(Integer productId);
}
