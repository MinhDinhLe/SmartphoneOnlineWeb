package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThanhvienController {
    @RequestMapping("/sign")
    public String signinup() {
        return "sign/login";
    }
}
