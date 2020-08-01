package com.team.house.service;

import com.team.house.entity.Street;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetService
 * @Description TODO
 * @Date 2019/10/20 9:24
 * @Created by Administrator
 */
public interface StreetService {
    //一功能一方法

    /**
     * 通过区域查询对应的街道
     * @param disstrictId
     * @return
     */
   List<Street> getStreetByDistrictId(Integer disstrictId);
}
