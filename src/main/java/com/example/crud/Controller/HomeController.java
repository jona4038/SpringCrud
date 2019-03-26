package com.example.crud.Controller;

import com.example.crud.Service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    IPersonService personService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("persons", personService.fetchAll());
        return "index";
    }
}
