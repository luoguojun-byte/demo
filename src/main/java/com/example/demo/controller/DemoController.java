package com.example.demo.controller;
import com.alibaba.fastjson2.JSON;
import com.example.demo.entity.Tuser;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("getuserlist")
    public String getUserList(){
        List<Tuser>tuserlist=demoService.getUserList();
        return JSON.toJSONString(tuserlist);
    }




    @ResponseBody
    @RequestMapping("updateuser")
    public String UpdateUser(HttpServletRequest request){

        String userid=request.getParameter("id");
        String password=request.getParameter("psw");

        demoService.updateUser(userid,password);
        List<Tuser>tuserlist=demoService.getUserList();

        return JSON.toJSONString(tuserlist);
    }

}
