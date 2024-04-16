package com.khanhhung.hellospringboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class MainController {

    @GetMapping("/")
	public String trangchu(ModelMap model) {
		///
		model.addAttribute("tb","Xin chào");
		model.addAttribute("hoten","Lữ Huỳnh Khánh Hưng: ");
		return "index"; 
	}
}
