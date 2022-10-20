package com.example.demo.mapper;

import com.example.demo.entity.Tuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemoMapper {

    List<Tuser>getUserList();
    void updateUser(@Param("id")String userid, @Param("psw")String password);
}
