package khanhhung.duan.duancanhan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.model.ProductCategoryDTO;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT new khanhhung.duan.duancanhan.ProductCategoryDTO(p.productId, p.name, c.categoryName, p.hoatChat, p.chiDinh, p.dangBaoChe, p.noiSanXuat, p.luuY, p.anh, p.giaTien) FROM Product p JOIN p.category c")
    List<ProductCategoryDTO> findAllProductsWithCategoryNames();
    

}
