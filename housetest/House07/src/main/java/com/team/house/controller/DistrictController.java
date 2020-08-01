package com.team.house.controller;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.District;
import com.team.house.service.DistrictService;
import com.team.house.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王建兵
 * @Classname DistrictController
 * @Description TODO
 * @Date 2019/10/13 11:55
 * @Created by Administrator
 */
@RestController
//@RestController=@Controller + @ResponseBody
@RequestMapping("/admin/")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @RequestMapping("getAllDistrict")
    @ResponseBody
    public List<District> getAllDistrict(){
        return districtService.getAllDistrict();
    }


    //由于前端使用的datagrid 所以他自动传参 page 页码,rows页大小
    @RequestMapping("getDistrictByPage")
    @ResponseBody
    public Map<String,Object> getDistrictByPage(PageUtil pageUtil){
        //调用业务
        PageInfo<District> pageInfo=districtService.getDisrictByPage(pageUtil);

        //使用map封装返回的数据
        Map<String,Object> map=new HashMap<>();
        map.put("rows",pageInfo.getList());
        map.put("total",pageInfo.getTotal());
        return map;
    }


    //由于前端使用的datagrid 所以他自动传参 page 页码,rows页大小
    @RequestMapping("addDistrit")
    @ResponseBody   //{"result":0}
    public Map<String,Object> addDistrit(District district){
        //调用业务
        int flag=districtService.addDistrict(district);
        //使用map封装返回的数据
       // return "{\"result\":"+flag+"}";  //手工拼的json
        Map<String,Object> map=new HashMap<>();
        map.put("result",flag);  //自动将对象转化为json
        return map;
    }

    //接由前端传递的区域编号，查询当前记录
    @RequestMapping("getDistrit")
    @ResponseBody   //{"result":0}
    public District getDistrit(Integer id){
        //调用业务
       District district =districtService.getDistrict(id);
        //使用map封装返回的数据
       return district;
    }

    //修改区域`
    @RequestMapping("upDistrit")
    @ResponseBody   //{"result":0}
    public Map<String,Object> upDistrit(District district){
        //调用业务
        int flag=districtService.updateDistrict(district);
        //使用map封装返回的数据
        // return "{\"result\":"+flag+"}";  //手工拼的json
        Map<String,Object> map=new HashMap<>();
        map.put("result",flag);  //自动将对象转化为json
        return map;
    }


    //删除区域
    @RequestMapping("delDistrit")
    @ResponseBody   //{"result":0}
    public Map<String,Object> delDistrit(Integer id){
        //调用业务
        int flag=0;
        try{
            flag=districtService.delDistrict(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("ddd"+flag);
        //使用map封装返回的数据
        // return "{\"result\":"+flag+"}";  //手工拼的json
        Map<String,Object> map=new HashMap<>();
        map.put("result",flag);  //自动将对象转化为json
        return map;
    }



    //批量删除区域  delMoreDistrit?ids=1006&ids=1007  ====>Integer []ids
   // delMoreDistrit?ids=1006,1007  ====>String ids
    @RequestMapping("delMoreDistrit")
    @ResponseBody   //{"result":0}
    public Map<String,Object> delMoreDistrit(String ids){

        //将字符串转化为数组  {1006,1007}
        String [] list=ids.split(",");
        Integer [] ary=new Integer[list.length];
        for (int i = 0; i <list.length ; i++) {
          ary[i]=Integer.parseInt(list[i]);
        }
        //调用业务
         int flag=districtService.delMoreDistrict(ary);

        //使用map封装返回的数据
        // return "{\"result\":"+flag+"}";  //手工拼的json
        Map<String,Object> map=new HashMap<>();
        map.put("result",flag);  //自动将对象转化为json
        return map;
    }
}
