package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.District;
import com.team.house.util.PageUtil;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictService
 * @Description TODO
 * @Date 2019/10/13 11:52
 * @Created by Administrator
 */
public interface DistrictService {
    //一功能一方法
    List<District> getAllDistrict();

    //查询所有区域支持分页
    public PageInfo<District> getDisrictByPage(PageUtil pageInfo);

    /**
     * 添加区域
     * @param district
     * @return 影响行数
     */
    public int addDistrict(District district);

    /**
     * 能过编号获取区域单条记录
     * @param id 编号
     * @return 区域对象
     */
    public District getDistrict(Integer id);

    /**
     * 修改区域信息
     * @param district   区域信息的实体
     * @return  影响行数
     */
    public int updateDistrict(District district);

    /**
     * 删除区域信息
     * @param id 区域编号
     * @return影响行数
     */
    public int delDistrict(Integer id);

    /**
     * 批量删除区域
     * @param ids 区域编号数组
     * @return 影响行数
     */
    public int delMoreDistrict(Integer[] ids);


}
