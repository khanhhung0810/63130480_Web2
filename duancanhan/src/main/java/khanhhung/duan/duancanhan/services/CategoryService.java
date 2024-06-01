package khanhhung.duan.duancanhan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khanhhung.duan.duancanhan.model.Category;

import khanhhung.duan.duancanhan.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository cRepo;

      public List<Category> getAllCategories() {
        return cRepo.findAll();
    }
    public Category createCategory(Category category) {
        return cRepo.save(category);
    }

    public void deleteCategoryById(int categoryId) {
        cRepo.deleteById(categoryId);
    }

    public Integer getCategoryIdByName(String categoryName) {
        Category category = cRepo.findByCategoryName(categoryName);
        if (category != null) {
            return category.getCategoryId();
        }
        return null; 
    }
}
