package com.groceryREST.groceryREST.Entity;

import java.math.BigDecimal;

public class GroceryItem {

    private int id;
    private String name;
    private String description;
    private String category;
    private boolean requriesRefrigeration;
    private BigDecimal price;

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