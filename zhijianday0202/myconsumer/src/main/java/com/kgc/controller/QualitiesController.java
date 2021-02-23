package com.kgc.controller;

import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class QualitiesController {
    @Autowired
    QualitiesService qualitiesService;

    @RequestMapping("getq/{productId}")
    public Qualities getq(@PathVariable("productId") Integer productId) {
        return qualitiesService.getq(productId);
    }

    @PostMapping("updateq")
    public int updateq(Qualities qualities) {
        return qualitiesService.updateq(qualities);
    }

    @RequestMapping("addq/{productId}")
    public int addq(@PathVariable("productId")Integer productId) {
        return qualitiesService.addq(productId);
    }
}
