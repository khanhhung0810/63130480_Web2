package khanhhung.duan.duancanhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    
    @GetMapping("/shop")
    public String shop(){
        return "home/shop";
    }

}
