package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.GroceryItem;

import java.util.List;
import java.util.Set;

public interface IGroceryItemDAO {

    public GroceryItem getGroceryItem(int id);
    public List<GroceryItem> getAllGroceryItems();
    public void editGroceryItem(GroceryItem oldGroceryItem, GroceryItem newGroceryItem);
    public void editGroceryItem(int oldGroceryItemId, GroceryItem newGroceryItem);
    public List<GroceryItem> getGroceryItemsByCategory(String category);
    public void addGroceryItem(GroceryItem groceryItem);

}
