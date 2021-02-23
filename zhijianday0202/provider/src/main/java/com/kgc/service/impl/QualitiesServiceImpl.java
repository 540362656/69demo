package com.kgc.service.impl;

import com.kgc.mapper.QualitiesMapper;
import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualitiesServiceImpl implements QualitiesService {
    @Autowired
    QualitiesMapper qualitiesMapper;

    @RequestMapping("getq/{productId}")
    public Qualities getq(@PathVariable("productId") Integer productId) {
        return qualitiesMapper.getq(productId);
    }

    @RequestMapping("updateq")
    public int updateq(@RequestBody Qualities qualities) {
        return qualitiesMapper.updateq(qualities);
    }

    @RequestMapping("addq/{productId}")
    public int addq(@PathVariable("productId")Integer productId) {
        return qualitiesMapper.addq(productId);
    }
}
