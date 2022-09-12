package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.Cart;

public interface ICartDAO {
    public Cart getCart(int cardId);
    public void updateCart(Cart cart);
}
