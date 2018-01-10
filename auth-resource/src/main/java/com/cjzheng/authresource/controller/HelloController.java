package com.cjzheng.authresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by CJ Zheng on 2018/1/5.
 * Project: auth-resource
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController {
    @GetMapping("principal")
    public Principal user(Principal principal){
        return principal;
    }
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
