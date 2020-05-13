package com.emart.user.dao;

import com.emart.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<UserEntity, Integer> {

  @Modifying
  @Query(value = "insert into user (USERNAME, PASSWORD, REGISTTIME) values " +
    "(:userName, :password, NOW())", nativeQuery=true)
  void registUser(@Param("userName") String userName, @Param("password")  String password);
}
