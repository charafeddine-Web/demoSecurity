package com.sec.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello User, you are authenticated!";
    }

    @GetMapping("/admin/dashboard")
    public String admin() {
        return "Admin Dashboard";
    }
}

