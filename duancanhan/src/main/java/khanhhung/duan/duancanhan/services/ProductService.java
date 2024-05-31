package khanhhung.duan.duancanhan.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khanhhung.duan.duancanhan.model.Product;
import khanhhung.duan.duancanhan.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pRepo;
    
    public Product createProduct(Product product) {
        return pRepo.save(product);
    }

    public Product getProductById(int productId) {
        Optional<Product> productOptional = pRepo.findById(productId);
        if (productOptional.isPresent()) {
            return productOptional.get();
        } else {
            throw new RuntimeException("Product not found with id " + productId);
        }
    }
}
   


