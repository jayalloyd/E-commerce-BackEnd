package com.dreamzdesigno.E_commerce.BackEnd.Repo;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.CartResponse;
import com.dreamzdesigno.E_commerce.BackEnd.model.Cart;
import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Integer> {


    CartResponse save(CartResponse cart);
}
