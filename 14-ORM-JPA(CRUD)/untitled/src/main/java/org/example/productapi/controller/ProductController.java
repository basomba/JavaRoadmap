package org.example.productapi.controller;


import org.example.modelo.Product;
import org.example.repositorio.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
           return productRepository.save(product);
    }




}
