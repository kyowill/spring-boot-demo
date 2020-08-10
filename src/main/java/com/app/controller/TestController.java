package com.app.controller;

import com.app.properties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    Student student;

    @Value("${msg}")
    String msg;

    @RequestMapping("test")
    public String Test1(){
        return student.toString() + "---" + msg;
    }
}
