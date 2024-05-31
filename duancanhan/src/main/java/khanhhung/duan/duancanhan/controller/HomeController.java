package khanhhung.duan.duancanhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.repository.ProductRepository;
import khanhhung.duan.duancanhan.services.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository repo;
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "home/shop";
    }

    @GetMapping("/shopdetail/{id}")
    public String shopDetail(@PathVariable("id") int id, Model model) {
        try {
            Product product = productService.getProductById(id);
            model.addAttribute("product", product);
        } catch (RuntimeException ex) {
            model.addAttribute("error", ex.getMessage());
        }
        return "home/shop-detail";
    }
}
