package com.UseCase1.assignment_aditya.Service;

import com.UseCase1.assignment_aditya.Entity.ProductEntity;
import com.UseCase1.assignment_aditya.Model.Product;
import com.UseCase1.assignment_aditya.Repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        ProductEntity productEntity = productRepository.save(new ProductEntity(product.getProductName(), product.getDescription(), product.getPrice()));
        return new Product(productEntity.getId(), productEntity.getProductName(), productEntity.getDescription(), productEntity.getPrice());
    }

    public List<Product> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return productEntities.stream()
                .map(entity -> new Product(entity.getId(), entity.getProductName(), entity.getDescription(), entity.getPrice()))
                .collect(Collectors.toList());
    }
}

