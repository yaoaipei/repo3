package com.team.house.util;

/**
 * @author 王建兵
 * @Classname UserCondition
 * @Description TODO
 * @Date 2019/10/17 10:37
 * @Created by Administrator
 */
//封装用户查询条件实体
public class UserCondition  extends PageUtil{
    //一个条件一个属性
    private String name;
    private String telephone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
