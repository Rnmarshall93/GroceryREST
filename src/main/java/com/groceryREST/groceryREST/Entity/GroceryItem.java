package com.groceryREST.groceryREST.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "GroceryItem")
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "requires_refrigeration")
    private boolean requriesRefrigeration;

    private String imageUrl;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {CascadeType.MERGE},
    mappedBy = "itemsInCart")
    @JsonBackReference
    private List<Cart> carts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isRequriesRefrigeration() {
        return requriesRefrigeration;
    }

    public void setRequriesRefrigeration(boolean requriesRefrigeration) {
        this.requriesRefrigeration = requriesRefrigeration;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(ArrayList<Cart> carts) {
        this.carts = carts;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public GroceryItem(int id, String name, String description, String category, boolean requriesRefrigeration, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.requriesRefrigeration = requriesRefrigeration;
        this.price = price;
    }

    public GroceryItem(String name, String description, String category, boolean requriesRefrigeration, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.requriesRefrigeration = requriesRefrigeration;
        this.price = price;
    }

    public GroceryItem() {
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", requriesRefrigeration=" + requriesRefrigeration +
                ", price=" + price +
                '}';
    }
}