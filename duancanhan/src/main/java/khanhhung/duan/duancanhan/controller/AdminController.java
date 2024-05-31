package khanhhung.duan.duancanhan.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.repository.ProductRepository;

@Controller
public class AdminController {

    @Autowired   
    private ProductRepository  repo;

    @GetMapping("/admin")
    public String index(Model model){
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "admin/index";
    }

 
    @GetMapping("/admin-category")
    public String categories(){
        return "admin/add-category";
    }
}
