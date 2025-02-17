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
         ProductSellerDTO listedDTO=productService.createListing(productSellerDTO);
         return new ResponseEntity<>(listedDTO,HttpStatus.CREATED);

     }

































}

