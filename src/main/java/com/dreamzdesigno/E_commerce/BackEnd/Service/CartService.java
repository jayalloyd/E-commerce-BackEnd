package com.dreamzdesigno.E_commerce.BackEnd.Service;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.CartResponse;
import com.dreamzdesigno.E_commerce.BackEnd.Repo.CartRepo;
import com.dreamzdesigno.E_commerce.BackEnd.model.Cart;
import com.dreamzdesigno.E_commerce.BackEnd.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private ModelMapper modelMapper;
    public Cart saveProducts(CartResponse cartResponse) {
       Cart cart = modelMapper.map(cartResponse, Cart.class);

        return cartRepo.save(cart);

    }
}
