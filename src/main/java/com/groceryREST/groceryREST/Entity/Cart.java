package com.groceryREST.groceryREST.Entity;
import javax.persistence.*;
import java.util.Set;


@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "userId")
    private int userId;

    //todo setup many to many relationship
    @Transient
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