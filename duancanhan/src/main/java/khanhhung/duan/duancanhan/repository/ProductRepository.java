package khanhhung.duan.duancanhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khanhhung.duan.duancanhan.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
