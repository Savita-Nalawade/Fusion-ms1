package com.example.fusion_ms1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethod2 {
    @GetMapping("/GetMethod2")
    public String getData() {return  "Hello AWS-Devops Team" ; }
}