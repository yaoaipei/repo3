package com.team.house.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.entity.House;
import com.team.house.mapper.HouseMapper;
import com.team.house.service.HouseService;
import com.team.house.util.HouseCondition;
import com.team.house.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王建兵
 * @Classname HouseServiceImpl
 * @Description TODO
 * @Date 2019/10/20 10:45
 * @Created by Administrator
 */
@Service
public class HouseServiceImpl implements HouseService
{
   @Autowired
   private HouseMapper houseMapper;
    @Override
    public int addHouse(House house) {
        return houseMapper.insertSelective(house);
    }

    @Override
    public List<House> getHouseByUserid(Integer uid) {
        return houseMapper.getHouseByUser(uid);
    }

    @Override
    public House getHouseById(String id) {
        House house=houseMapper.getHouseById(id);
        return house;
    }

    @Override
    public int updateHouse(House house) {
        return houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public int delHouse(String id,Integer state) {
        //创建实体
        House house=new House();
        //设置房屋编号
        house.setId(id);
        //设置删除的状态
        house.setIsdel(state);
        return houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public PageInfo<House> getHouseByPassSate(Integer state, PageUtil pageUtil) {
        //开启分页
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        //查询所有
        List<House> list=houseMapper.getHouseByPassState(state);
        return new PageInfo<House>(list);
    }

    @Override
    public int updateHousePassState(String id, Integer state) {
        House  house=new House();
        house.setId(id); //编号
        house.setIspass(state); //审核状态
        return this.houseMapper.updateByPrimaryKeySelective(house);
    }

    @Override
    public PageInfo<House> getHouseByBroswer(HouseCondition condition) {
        //开启分页
        PageHelper.startPage(condition.getPage(),condition.getRows());
        //查询
        List<House> list=this.houseMapper.getHouseByBroswer(condition);
        //获取分页信息
        PageInfo<House> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }


}
