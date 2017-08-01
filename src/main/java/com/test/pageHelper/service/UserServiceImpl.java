package com.test.pageHelper.service;

import com.github.pagehelper.PageHelper;
import com.test.pageHelper.dao.UserMapper;
import com.test.pageHelper.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by guanguan on 2017/7/20.
 */
@Service
public class UserServiceImpl extends ServicesImpl<User> implements UserService{

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> getAll(User user){
        if(user.getPage()!=null && user.getRows()!=null){
            PageHelper.startPage(user.getPage(),user.getRows());
        }
        HashMap<String,Object> params= new HashMap<String, Object>();
        return userMapper.findBy(new HashMap<Object, Object>());

    }

}

