package com.example.fusion_ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethod {
    @GetMapping("/GetMethod")
    public String getData() {return  "This is get method1: {Hello}" ; }
}