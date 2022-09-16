package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.DAO.ICartDAO;
import com.groceryREST.groceryREST.DAO.IGroceryItemDAO;
import com.groceryREST.groceryREST.Entity.Cart;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cart")
public class CartREST {

    @Autowired
    ApplicationContext context;

    @GetMapping("/getCartById")
    public String getCartById(@RequestParam int id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        ICartDAO cartDAO = context.getBean(ICartDAO.class);
        Cart foundCart = cartDAO.getCart(id);

        return mapper.writeValueAsString(foundCart);
    }
}