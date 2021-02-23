package com.kgc.feign;

import com.kgc.feign.impl.ProductsFeignImpl;
import com.kgc.feign.impl.QualitiesFeignImpl;
import com.kgc.pojo.Qualities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(name = "myprovider",fallback = QualitiesFeignImpl.class)
public interface QualitiesFeign {
    @RequestMapping("getq/{productId}")
    public Qualities getq(@PathVariable("productId") Integer productId);

    @RequestMapping("updateq")
    public int updateq(@RequestBody Qualities qualities);

    @RequestMapping("addq/{productId}")
    public int addq(@PathVariable("productId")Integer productId);
}
