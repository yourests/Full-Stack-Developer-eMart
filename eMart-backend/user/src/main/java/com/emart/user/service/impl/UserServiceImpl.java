package com.emart.user.service.impl;

import com.emart.user.dao.UserDao;
import com.emart.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public void registUser(String userName, String password) {
    userDao.registUser(userName, password);
  }
}
