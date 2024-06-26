package khanhhung.duan.duancanhan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import khanhhung.duan.duancanhan.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT c.categoryName  FROM Category c")
    List<String> findAllNames();

    Category findByCategoryName(String categoryName);

}
