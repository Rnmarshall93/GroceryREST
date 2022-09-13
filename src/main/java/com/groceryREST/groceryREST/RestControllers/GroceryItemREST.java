package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.DAO.CartDAOImpl;
import com.groceryREST.groceryREST.DAO.GroceryItemDAOImpl;
import com.groceryREST.groceryREST.DAO.VerifiedUserDAOImpl;
import com.groceryREST.groceryREST.Entity.Cart;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import com.groceryREST.groceryREST.Entity.VerifiedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class GroceryItemREST {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/")
    public String getGroceryItem() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        CartDAOImpl cartDAO = context.getBean(CartDAOImpl.class);
        GroceryItemDAOImpl groceryItemDao = context.getBean(GroceryItemDAOImpl.class);

        Cart debugCart = new Cart();
        debugCart.setUserId(1);



        GroceryItem g1 = groceryItemDao.getGroceryItem(70);
        GroceryItem g2 = groceryItemDao.getGroceryItem(71);
        GroceryItem g3 = groceryItemDao.getGroceryItem(72);
        GroceryItem g4 = groceryItemDao.getGroceryItem(73);
/*
        GroceryItem g1 = new GroceryItem("Carrots", "Fresh carrots from the farm.", "Produce", true, new BigDecimal(4.99));
        GroceryItem g2 = new GroceryItem("Chocolate Raisins", "Raisins dipped in chocolate.", "Candy", false, new BigDecimal(8.99));
        GroceryItem g3 = new GroceryItem("Lobster Tail", "Lobster tail fresh from the ocean.", "Seafood", true, new BigDecimal(24.99));
        GroceryItem g4 = new GroceryItem("Pepsi (12 pack)", "Cans of pepsi in a 12 pack.", "Candy", true, new BigDecimal(7.99));
 */
        debugCart.addGroceryItem(g1);
        debugCart.addGroceryItem(g2);
        debugCart.addGroceryItem(g3);
        debugCart.addGroceryItem(g4);
        cartDAO.addCart(debugCart);


        VerifiedUserDAOImpl verifiedUserDAO = context.getBean(VerifiedUserDAOImpl.class);
        VerifiedUser verifiedUser = verifiedUserDAO.getUser("jerry", "jerry");

                String output = mapper.writeValueAsString(debugCart);
        cartDAO.deleteCart(debugCart);
        return mapper.writeValueAsString(output);
    }
}