package com.team.house.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.house.entity.District;
import com.team.house.entity.DistrictExample;
import com.team.house.mapper.DistrictMapper;
import com.team.house.service.DistrictService;
import com.team.house.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictServiceImpl
 * @Description TODO
 * @Date 2019/10/13 11:53
 * @Created by Administrator
 */
@Service
@Transactional
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;
    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(new DistrictExample());
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)   //不基于事务执行
    public PageInfo<District> getDisrictByPage(PageUtil pageInfo) {
        //1.开启分页
        PageHelper.startPage(pageInfo.getPage(),pageInfo.getRows());
        //2.查询所有
        DistrictExample districtExample=new DistrictExample();
        List<District>  list=districtMapper.selectByExample(districtExample);
        //3.获取分页信息
        PageInfo<District> pageInfo1=new PageInfo(list);
        return pageInfo1;
    }

    @Override
    public int addDistrict(District district) {
        return districtMapper.insertSelective(district);
    }

    @Override
    public District getDistrict(Integer id) {
        //调用dao层
        return districtMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateDistrict(District district) {
        return districtMapper.updateByPrimaryKeySelective(district);
    }

    //删除区域  删除街道
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int delDistrict(Integer id) {
            int temp=0;
            //1.通过区域道编号删除街   //编写dao层
            districtMapper.deleteStreetByDistrict(id);
            temp++;
            int i=9,j=0;   i=i/j;
            //2.删除区域
            districtMapper.deleteByPrimaryKey(id);
            temp++;
            return temp;
    }


    @Override
    public int delMoreDistrict(Integer[] ids) {
        return districtMapper.deleteMoreDistrict(ids);
    }

}
