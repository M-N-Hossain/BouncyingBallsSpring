package com.example.bouncingball.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BouncyBallsController {

    @GetMapping("/")
    public String homepage(){
        return "home/index";
    }

}
