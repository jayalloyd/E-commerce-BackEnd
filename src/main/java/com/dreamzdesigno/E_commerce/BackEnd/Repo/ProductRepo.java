package com.dreamzdesigno.E_commerce.BackEnd.Repo;

import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    @Modifying
    @Transactional
    @Query( "DELETE  FROM Product p WHERE p.productName = :productName ")

    void deleteProductByProductName(String productName);
}