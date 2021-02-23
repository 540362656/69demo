package com.kgc.util;

import java.util.List;
import java.util.Map;

public class PageUtil<T> {
    private int pageindex;//当前页面
    private int pagesize;//每页条数
    private int totalcount;//总条数
    private int totalpage;//总页数
    private List<T> list;//当前的数据集合
    public PageUtil() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PageUtil(int pageindex, int pagesize, int totalcount, int totalpage,
                    List<T> list) {
        super();
        this.pageindex = pageindex;
        this.pagesize = pagesize;
        this.totalcount = totalcount;
        this.totalpage = totalpage;
        this.list = list;
    }
    public int getPageindex() {
        return pageindex;
    }
    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }
    public int getPagesize() {
        return pagesize;
    }
    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
    public int getTotalcount(Map<String, Object> map) {
        return totalcount;
    }
    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
        //计算总页数totalpage  总页数=总条数/每页的条数。 除不尽+1页
        this.totalpage=(this.totalcount%this.pagesize==0)?this.totalcount/this.pagesize:this.totalcount/this.pagesize+1;
    }
    public int getTotalpage() {
        return totalpage;
    }
    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }
    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }

}
