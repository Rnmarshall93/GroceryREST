package com.groceryREST.groceryREST.Entity;

import java.util.Set;

public class Cart {

    private int id;
    private int userId;
    private Set<GroceryItem> itemsInCart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Set<GroceryItem> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(Set<GroceryItem> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public Cart(int id, int userId, Set<GroceryItem> itemsInCart) {
        this.id = id;
        this.userId = userId;
        this.itemsInCart = itemsInCart;
    }

    public Cart() {
    }
}