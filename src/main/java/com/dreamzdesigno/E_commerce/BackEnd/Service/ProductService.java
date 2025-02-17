package com.dreamzdesigno.E_commerce.BackEnd.Service;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.ProductSellerDTO;
import com.dreamzdesigno.E_commerce.BackEnd.Repo.ProductRepo;
import com.dreamzdesigno.E_commerce.BackEnd.config.AppConfig;
import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service

public class ProductService {
    @Autowired
    private ProductRepo productRepo;



    @Autowired
    private ModelMapper modelMapper;


    public Product createListing(ProductSellerDTO productSellerDTO) {
    Product product=new Product();
    product=modelMapper.map(productSellerDTO,Product.class);
    return productRepo.save(product);



    }
}
