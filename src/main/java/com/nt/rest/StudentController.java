package com.nt.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000/")
 public class StudentController {
    @GetMapping("/msg")
    public String getMsg(){
        Date dt = new Date();
        return "Hello World "+dt.toString();
    }
}
