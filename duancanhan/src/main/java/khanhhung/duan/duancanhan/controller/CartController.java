package khanhhung.duan.duancanhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String index(){

        return "home/cart";
    }

    @GetMapping("/thankyou")
    public String thankY(){
        
        return "home/thankyou";
    }


}
