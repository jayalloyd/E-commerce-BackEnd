package com.dreamzdesigno.E_commerce.BackEnd.Repo;

import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import com.dreamzdesigno.E_commerce.BackEnd.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends JpaRepository<Seller,Long> {
}


