package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.GroceryItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class GroceryItemDaoImpl implements IGroceryItemDAO{

    @Autowired
    ApplicationContext context;

    @Autowired Configuration configuration;
    @Override
    public GroceryItem getGroceryItem(int id) {

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        GroceryItem foundItem = session.get(GroceryItem.class, id);

        session.getTransaction().commit();
        session.close();

        return foundItem;
    }

    @Override
    public GroceryItem editGroceryItem(GroceryItem groceryItem) {
        return null;
    }

    @Override
    public Set<GroceryItem> getGroceryItemsByCategory(String category) {
        return null;
    }
}