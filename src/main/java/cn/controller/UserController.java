package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("aa")
    public String test(String name, Model model) {
        System.out.println("sasasasasas"+name);
        model.addAttribute("name",name);
        System.out.println("123456789");
        System.out.println("asasas");
        return "one";
    }
}
