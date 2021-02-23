package com.kgc.feign.impl;

import com.kgc.feign.QualitiesFeign;
import com.kgc.pojo.Qualities;
import org.springframework.stereotype.Component;

@Component
public class QualitiesFeignImpl implements QualitiesFeign {
    @Override
    public Qualities getq(Integer productId) {
        return null;
    }

    @Override
    public int updateq(Qualities qualities) {
        return 0;
    }

    @Override
    public int addq(Integer productId) {
        return 0;
    }
}
