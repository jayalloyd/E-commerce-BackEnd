package com.dreamzdesigno.E_commerce.BackEnd.Controller;

import com.dreamzdesigno.E_commerce.BackEnd.DTO.CartResponse;
import com.dreamzdesigno.E_commerce.BackEnd.Service.CartService;
import com.dreamzdesigno.E_commerce.BackEnd.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
   private CartService cartService;

    @PostMapping("/saveProducts")
   public ResponseEntity<Cart> saveProductsInCart(@RequestBody CartResponse cartResponse) {
    Cart cart =cartService.saveProducts(cartResponse);
   return new ResponseEntity<>(cart, HttpStatus.CREATED);
    }
}
