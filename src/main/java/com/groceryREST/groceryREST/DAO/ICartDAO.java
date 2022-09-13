package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.Cart;

public interface ICartDAO {
    public Cart getCart(int cardId);
    public void updateCart(Cart cart);
    public void addCart(Cart cart);
    public void deleteCart(int cartId);
    public void deleteCart(Cart cart);
}
