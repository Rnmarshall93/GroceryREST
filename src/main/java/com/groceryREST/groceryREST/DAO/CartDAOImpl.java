package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CartDAOImpl implements ICartDAO{

    @Autowired
    Configuration configuration;

    @Override
    public Cart getCart(int cartId) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Cart cart = session.get(Cart.class, cartId);
        cart.getItemsInCart().size();
        session.getTransaction().commit();
        session.close();

        return cart;
    }

    @Override
    public void updateCart(Cart cart) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.update(cart);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void addCart(Cart cart) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(cart);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteCart(int cartId) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Cart cartToDelete = session.get(Cart.class, cartId);
        session.delete(cartToDelete);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteCart(Cart cart) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.delete(cart);

        session.getTransaction().commit();
        session.close();
    }


}