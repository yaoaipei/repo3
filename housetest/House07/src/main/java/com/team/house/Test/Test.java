package com.team.house.Test;

import com.team.house.service.DistrictService;
import com.team.house.service.impl.DistrictServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王建兵
 * @Classname Test
 * @Description TODO
 * @Date 2019/10/15 11:55
 * @Created by Administrator
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    DistrictServiceImpl districtService=(DistrictServiceImpl)ctx.getBean("districtServiceImpl");
        try {
        districtService.delDistrict(1020);
    }catch (Exception ex){
        System.out.println(ex.getMessage());
    }
        System.out.println("成功");
}
}
