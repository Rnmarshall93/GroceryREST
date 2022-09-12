package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.GroceryItem;

import java.util.Set;

public interface IGroceryItemDAO {

    public GroceryItem getGroceryItem(int id);
    public GroceryItem editGroceryItem(GroceryItem groceryItem);
    public Set<GroceryItem> getGroceryItemsByCategory(String category);


}
