package com.ejemplo.productoapi.controller;

import org.example.modelo.Product;
import org.example.repositorio.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductoController {

    @Autowired
    private ProductRepository productRepository;


    @PostMapping
    public Product createProduct(@RequestBody Product product) {
         return productRepository.save(product);
    }


    @GetMapping
    public List<Product> listaProducts() {
        return productRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> obtenerProducto(@PathVariable Long id) {
        return productRepository.findById(id)
                .map(producto -> ResponseEntity.ok().body(producto))
                .orElse(ResponseEntity.notFound().build());
    }
}
