package com.team.house.service;

import com.github.pagehelper.PageInfo;
import com.team.house.entity.Users;
import com.team.house.util.PageUtil;
import com.team.house.util.UserCondition;

/**
 * @author 王建兵
 * @Classname UserService
 * @Description TODO
 * @Date 2019/10/17 10:29
 * @Created by Administrator
 */
public interface UserService {

    //带条件搜索用户 分页
    PageInfo<Users> getUserByCondition(UserCondition condition);

    /**
     * 注册用户  房东
     * @param users  用户信息
     * @return 影响行数
     */
    int addUser(Users users);

    /**
     * 检查用户名是否存在
     * @param name  用户名
     * @return 返回0可用  返回不为0的数不可用
     */
    int checkUserName(String name);

    /**
     * 实现用户登入
     * @param name 用户名
     * @param password  密码
     * @return 返回用户信息
     */
    Users  login(String name, String password);

}
