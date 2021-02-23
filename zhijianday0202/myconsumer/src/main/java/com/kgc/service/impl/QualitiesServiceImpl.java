package com.kgc.service.impl;

import com.kgc.feign.QualitiesFeign;
import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualitiesServiceImpl implements QualitiesService {
    @Autowired
    QualitiesFeign qualitiesFeign;

    @Override
    public Qualities getq(Integer productId) {
        return qualitiesFeign.getq(productId);
    }

    @Override
    public int updateq(Qualities qualities) {
        return qualitiesFeign.updateq(qualities);
    }

    @Override
    public int addq(Integer productId) {
        return qualitiesFeign.addq(productId);
    }
}
