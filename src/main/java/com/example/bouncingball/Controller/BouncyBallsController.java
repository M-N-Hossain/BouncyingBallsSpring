package com.example.bouncingball.Controller;

import com.example.bouncingball.DAO.DeveloperDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BouncyBallsController {

    @Autowired
    DeveloperDAO developerDAO;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("developer",developerDAO.getDeveloper("Emil Høeg Engelbrechtsen"));

        return "home/index";
    }

}
