package com.app.controller;

import com.app.biz.RunoobService;
import com.app.dal.RunoobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RunoobService runoobService;

    @RequestMapping("test")
    public String Test1(){
        runoobService.doQuery();
        return "success";
    }
}
