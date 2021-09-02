package com.saiev.LessonSpringBoot.service;


import com.saiev.LessonSpringBoot.entities.Product;
import com.saiev.LessonSpringBoot.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public Product getProductById(int id) {
        return productsRepository.getProductById(id);
    }

    public List<Product> getProductList() {
        return productsRepository.getProductList();
    }

    public void addProduct(Product newProduct) {
        productsRepository.addProduct(newProduct);
    }

    public ProductsService() {

    }
}
