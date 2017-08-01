package com.test.pageHelper.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.pageHelper.model.User;
import com.test.pageHelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * Created by guanguan on 2017/8/1.
 */
@Controller
public class UserController {


    @Autowired
    UserService userService;




    @RequestMapping("/")
    @ResponseBody
    public String index() {
        Integer page=2;
        Integer rows=3;

        PageHelper.startPage(page, rows);
        List<User> userList = userService.findBy(new HashMap<Object, Object>());
        PageInfo pageInfo = new PageInfo(userList);
        User user = new User();
//        user.setPage(3);
//        user.setRows(1);
        List<User> users=userService.getAll(user);
        return JSON.toJSONString(users);
    }

}
