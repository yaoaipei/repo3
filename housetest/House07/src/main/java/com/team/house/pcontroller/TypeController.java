package com.team.house.pcontroller;

import com.team.house.entity.Type;
import com.team.house.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 王建兵
 * @Classname TypeController
 * @Description TODO
 * @Date 2019/10/20 8:46
 * @Created by Administrator
 */
@Controller(value = "typeController2")
@RequestMapping("/page/")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("getAllType")
    @ResponseBody
    public List<Type> getAllType(){
       return  this.typeService.getAllType();
    }
}
