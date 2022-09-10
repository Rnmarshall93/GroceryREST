package com.groceryREST.groceryREST.RestControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groceryREST.groceryREST.Entity.GroceryItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
public class GroceryItemREST {

    @GetMapping("/")
    public String getGroceryItem() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        GroceryItem testItem = new GroceryItem(-1, "Strawberries", "A 1LB clamshell container of strawberries",
                "Fruit", true, new BigDecimal(12.99).setScale(3, RoundingMode.FLOOR).stripTrailingZeros());

        return mapper.writeValueAsString(testItem);
    }
}