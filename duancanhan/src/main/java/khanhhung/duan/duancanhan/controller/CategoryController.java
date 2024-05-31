package khanhhung.duan.duancanhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import khanhhung.duan.duancanhan.model.Category;
import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.repository.CategoryRepository;
import khanhhung.duan.duancanhan.services.CategoryService;

@Controller
public class CategoryController {
    
    @Autowired
    CategoryService categoryService;

    @Autowired
    private CategoryRepository cPo;

    @GetMapping("/add-category")
    public String categories(Model model){
        List<Category> categories = cPo.findAll();
        model.addAttribute("categories", categories);
        return "admin/add-category";
    }

    @PostMapping("/add-category")
    public String addProduct(@ModelAttribute Category newCategory, RedirectAttributes ra) {
        Category createdCategory = categoryService.createCategory(newCategory);
    ra.addFlashAttribute("successMessage", "Danh mục mới đã được thêm thành công: " + createdCategory.getCategoryName());
    return "redirect:/admin-category";
} 
}
