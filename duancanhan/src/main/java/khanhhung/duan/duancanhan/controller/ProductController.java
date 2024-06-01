package khanhhung.duan.duancanhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import khanhhung.duan.duancanhan.model.Category;
import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.services.CategoryService;
import khanhhung.duan.duancanhan.services.ProductService;

@Controller

public class ProductController {    

    @Autowired
    ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/add-product")
    public String addProductView(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("product", new Product());
        
        return "admin/add-product";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute Product newProduct, RedirectAttributes ra) {
    Product createdProduct = productService.createProduct(newProduct);
    ra.addFlashAttribute("successMessage", "Sản phẩm mới đã được thêm thành công: " + createdProduct.getName());
    return "redirect:/admin";
    
    }
    
    @GetMapping("/edit-product/{id}")
    public String editProduct(@PathVariable("id") int  productId, Model model) {
    Product product = productService.getProductById(productId);
    model.addAttribute("product", product);

    List<Category> categories = categoryService.getAllCategories();
    model.addAttribute("categories", categories);
    return "admin/edit-product";
    }

    @PostMapping("/edit-product/{id}")
    public String updateProduct(@PathVariable("id") int productId, @ModelAttribute Product product) {
        product.setProductId(productId);
        productService.updateProduct(product);  
        return "redirect:/admin";
    }
    
    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable("id") int productId) {
        productService.deleteProductById(productId);
        return "redirect:/admin";
    }

}
