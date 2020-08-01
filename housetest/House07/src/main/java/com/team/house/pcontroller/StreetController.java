package com.team.house.pcontroller;

import com.team.house.entity.Street;
import com.team.house.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StreetController
 * @Description TODO
 * @Date 2019/10/20 9:31
 * @Created by Administrator
 */
@Controller(value = "streetController2")
@RequestMapping("/page/")
public class StreetController {
    @Autowired
    private StreetService streetService;

    //通过区域编号查询街道
    @RequestMapping("getStreetByDid")
    @ResponseBody
    public List<Street> getStreetByDid(Integer did){
        return streetService.getStreetByDistrictId(did);
    }

}
