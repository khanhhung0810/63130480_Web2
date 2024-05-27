package khanhhung.duan.duancanhan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khanhhung.duan.duancanhan.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
