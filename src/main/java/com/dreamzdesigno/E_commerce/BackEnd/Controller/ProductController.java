package com.dreamzdesigno.E_commerce.BackEnd.Controller;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.ProductSellerDTO;
import com.dreamzdesigno.E_commerce.BackEnd.Service.ProductService;
import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // Base URL for product-related operations
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("create")
     public ResponseEntity<ProductSellerDTO> createListing(@RequestBody ProductSellerDTO productSellerDTO){
         Product product=productService.createListing(productSellerDTO);
         return new ResponseEntity<>(product,HttpStatus.CREATED);

     }


     @GetMapping("viewAllProducts")
     public ResponseEntity<List<Product>>getAllProducts(){
        List<Product>products=productService.getAllProducts();
         if (products.isEmpty()) { // Check if list is empty
             return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 if no products
         } else {
             return new ResponseEntity<>(products, HttpStatus.OK); // Return 200 with products
         }
    }


    @DeleteMapping("delete")
    public ResponseEntity<Product> deleteProduct(@RequestBody Product product){
      productService.deleteProductByProductName(product.getProductName());
      return ResponseEntity.noContent().build();
    }




























}

