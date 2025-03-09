package com.dreamzdesigno.E_commerce.BackEnd.Service;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.ProductSellerDTO;
import com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo;
import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepo productRepo;


    @Autowired
    private ModelMapper modelMapper;

//
//    public Product createListing(ProductSellerDTO productSellerDTO) {
//        Product product = new Product();
//        product = modelMapper.map(productSellerDTO, Product.class);
//        return productRepo.save(product);
//
//
//    }
public Product createListing(ProductSellerDTO productSellerDTO) {
    System.out.println(" Inside ProductService.createListing");
    Product product = modelMapper.map(productSellerDTO, Product.class);
    return productRepo.save(product);
}

    public List<Product> getAllProducts() {

        return productRepo.findAll();

    }

    public void deleteProductByProductName(String productName) {
        productRepo.deleteProductByProductName(productName);
    }
}
