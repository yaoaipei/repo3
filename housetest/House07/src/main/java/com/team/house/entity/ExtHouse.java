package com.team.house.entity;

/**
 * @author 王建兵
 * @Classname ExtHouse
 * @Description TODO
 * @Date 2019/10/21 15:03
 * @Created by Administrator
 */
public class ExtHouse extends  House {
    private String dname;
    private String sname;
    private String tname;

    @Override
    public String getDname() {
        return dname;
    }

    @Override
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String getSname() {
        return sname;
    }

    @Override
    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String getTname() {
        return tname;
    }

    @Override
    public void setTname(String tname) {
        this.tname = tname;
    }
}
