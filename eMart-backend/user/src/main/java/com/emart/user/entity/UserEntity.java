package com.emart.user.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int userId;
  private String userName;
  private String password;
  private String registTime;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRegistTime() {
    return registTime;
  }

  public void setRegistTime(String registTime) {
    this.registTime = registTime;
  }
}
