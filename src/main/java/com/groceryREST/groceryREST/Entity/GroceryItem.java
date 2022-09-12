package com.groceryREST.groceryREST.Entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

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

    @Column(name = "requiresRefrigeration")
    private boolean requriesRefrigeration;

    @Column(name = "price")
    private BigDecimal price;

    //todo create manyToManyRelationship with Cart
    @Transient
    private Set<Cart> carts;

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