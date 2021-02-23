package com.kgc.pojo;

public class Qualities {
     private Integer id;//编号
     private Integer score;//质检结果
    private String qualityDesc;//质检备注
    private Integer productId;//产品编号

    public Qualities(Integer id, Integer score, String qualityDesc, Integer productId) {
        this.id = id;
        this.score = score;
        this.qualityDesc = qualityDesc;
        this.productId = productId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getQualityDesc() {
        return qualityDesc;
    }

    public void setQualityDesc(String qualityDesc) {
        this.qualityDesc = qualityDesc;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Qualities() {
        super();
    }
}
