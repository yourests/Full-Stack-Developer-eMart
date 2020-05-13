package com.emart.user.controller;

import com.emart.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping('registUser')
  public void registUser(@RequestParam("userName") String userName,
                         @RequestParam("password") String password) {
    userService.registUser(userName, password);
  }

}
