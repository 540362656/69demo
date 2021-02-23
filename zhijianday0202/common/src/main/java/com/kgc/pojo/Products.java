package com.kgc.pojo;

import java.util.Date;

public class Products {
    private  Integer id; //编号
    private String productName;//名称
    private String productDate;//日期
    private  Integer productSum;//数量
    private  String productDesc;//描述
    private Double productPrice;//价格
    private Integer score;//质检结果

    public Products(Integer id, String productName, String productDate, Integer productSum, String productDesc, Double productPrice, Integer score) {
        this.id = id;
        this.productName = productName;
        this.productDate = productDate;
        this.productSum = productSum;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Products() {
        super();
    }
}
