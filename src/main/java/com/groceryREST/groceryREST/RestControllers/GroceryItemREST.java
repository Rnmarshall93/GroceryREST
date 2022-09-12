package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.DAO.GroceryItemDaoImpl;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import com.groceryREST.groceryREST.GroceryRestApplication;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
public class GroceryItemREST {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/")
    public String getGroceryItem() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        GroceryItemDaoImpl groceryItemDao = context.getBean(GroceryItemDaoImpl.class);
        GroceryItem testItem = groceryItemDao.getGroceryItem(1);

        return mapper.writeValueAsString(testItem);
    }
}