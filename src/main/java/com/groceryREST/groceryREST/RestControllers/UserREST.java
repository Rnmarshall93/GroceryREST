package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.DAO.IGroceryItemDAO;
import com.groceryREST.groceryREST.DAO.IVerifiedUserDAO;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import com.groceryREST.groceryREST.Entity.VerifiedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserREST {

    @Autowired
    private ApplicationContext context;

    /**
     * FOR TESTING ONLY THIS SHOULD NOT BE IN PROD.
     * @param username
     * @param password
     * @return
     * @throws JsonProcessingException
     */
    @GetMapping("/getUser")
    public String getUser(@RequestParam String username, @RequestParam String password) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        IVerifiedUserDAO verifiedUserDAO = context.getBean(IVerifiedUserDAO.class);
        VerifiedUser foundUser = verifiedUserDAO.getUser(username, password);

        return mapper.writeValueAsString(foundUser);
    }
}