package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.DAO.CartDAOImpl;
import com.groceryREST.groceryREST.DAO.GroceryItemDAOImpl;
import com.groceryREST.groceryREST.DAO.IGroceryItemDAO;
import com.groceryREST.groceryREST.DAO.VerifiedUserDAOImpl;
import com.groceryREST.groceryREST.Entity.Cart;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import com.groceryREST.groceryREST.Entity.VerifiedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/GroceryItem")
public class GroceryItemREST {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/getItem")
    public String getGroceryItem(@RequestParam int id) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        IGroceryItemDAO groceryItemDAO = context.getBean(IGroceryItemDAO.class);
        GroceryItem foundItem = groceryItemDAO.getGroceryItem(id);

        return mapper.writeValueAsString(foundItem);
    }

    @GetMapping("/getAllItems")
    public String getAllGroceryItems() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        IGroceryItemDAO groceryItemDAO = context.getBean(IGroceryItemDAO.class);

        return mapper.writeValueAsString(groceryItemDAO.getAllGroceryItems());
    }
}