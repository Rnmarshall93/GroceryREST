package com.groceryREST.groceryREST.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "userId")
    private int userId;

    @PreRemove
    public void logRemoval()
    {
        Cart c = this;
        c.setItemsInCart(null);
        System.out.println("\tRemoved\tCart");
    }


    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {CascadeType.ALL})
    @JoinTable(
            name="cart_groceryitem",
            joinColumns = {@JoinColumn(name = "cartId")},
            inverseJoinColumns = {@JoinColumn(name = "groceryItemId")}
    )
    @JsonManagedReference
    private List<GroceryItem> itemsInCart;

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

    public List<GroceryItem> getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(ArrayList<GroceryItem> itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public void addGroceryItem(GroceryItem groceryItem) {
        if(itemsInCart == null)
            itemsInCart = new ArrayList<GroceryItem>();
        itemsInCart.add(groceryItem);
    }

    public Cart(int id, int userId, ArrayList<GroceryItem> itemsInCart) {
        this.id = id;
        this.userId = userId;
        this.itemsInCart = itemsInCart;
    }

    public Cart() {
    }
}