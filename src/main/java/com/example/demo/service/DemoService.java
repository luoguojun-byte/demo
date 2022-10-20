package com.example.demo.service;

import com.example.demo.entity.Tuser;
import com.example.demo.mapper.DemoMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;
    public List<Tuser> getUserList(){
        return demoMapper.getUserList();
    }
    public void updateUser( String userid, String password){
        demoMapper.updateUser(userid,password);

    }
}
