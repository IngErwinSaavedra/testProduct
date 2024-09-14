package com.codingjava.productscrud.controllers;

import com.codingjava.productscrud.models.Product;
import com.codingjava.productscrud.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> listProducts() {
        return productService.listProduct();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
