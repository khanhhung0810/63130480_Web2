package khanhhung.duan.duancanhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/add-product")
    public String add(){
        return "admin/add-product";
    }
}
