package com.devsuperior.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Product;
import com.devsuperior.demo.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired // Utiliza um componente
    private ProductRepository productRepository; // Declarar o componente

    @GetMapping
    public List<Product> getObjects() {

        List<Product> list = productRepository.findAll();
        return list;
    }

    // Método que retorna um departamento e os produtos do banco de dados
}
