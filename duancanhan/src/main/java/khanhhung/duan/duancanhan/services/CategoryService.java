package khanhhung.duan.duancanhan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khanhhung.duan.duancanhan.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository cRepo;
    public List<String> getAllCategories() {
        return cRepo.findAllNames();
    }

}
