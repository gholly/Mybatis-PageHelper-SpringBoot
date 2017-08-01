package com.test.pageHelper.service;

import com.test.pageHelper.model.User;

import java.util.List;

/**
 * Created by guanguan on 2017/7/20.
 */
public interface UserService extends Services<User> {


      List<User> getAll(User user);


     }
