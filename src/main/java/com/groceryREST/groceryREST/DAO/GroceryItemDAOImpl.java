package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.GroceryItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Component
public class GroceryItemDAOImpl implements IGroceryItemDAO{

    @Autowired Configuration configuration;

    @Override
    public GroceryItem getGroceryItem(int id) {

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        GroceryItem foundItem = session.get(GroceryItem.class, id);
        foundItem.getCarts().size();
        session.getTransaction().commit();
        session.close();

        return foundItem;
    }

    @Override
    public void editGroceryItem(GroceryItem oldGroceryItem, GroceryItem newGroceryItem) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        oldGroceryItem.setName(newGroceryItem.getName());
        oldGroceryItem.setCategory(newGroceryItem.getCategory());
        oldGroceryItem.setDescription(newGroceryItem.getDescription());
        oldGroceryItem.setRequriesRefrigeration(newGroceryItem.isRequriesRefrigeration());
        oldGroceryItem.setPrice(newGroceryItem.getPrice());
        session.update(oldGroceryItem);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void editGroceryItem(int oldGroceryItemId, GroceryItem newGroceryItem) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        GroceryItem oldGroceryItem = session.get(GroceryItem.class, oldGroceryItemId);
        oldGroceryItem.setName(newGroceryItem.getName());
        oldGroceryItem.setCategory(newGroceryItem.getCategory());
        oldGroceryItem.setDescription(newGroceryItem.getDescription());
        oldGroceryItem.setRequriesRefrigeration(newGroceryItem.isRequriesRefrigeration());
        oldGroceryItem.setPrice(newGroceryItem.getPrice());
        session.update(oldGroceryItem);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<GroceryItem> getGroceryItemsByCategory(String category) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Query q = session.createQuery("FROM GroceryItem g WHERE g.category = :desiredCategory");
        q.setParameter("desiredCategory", category);
        List<GroceryItem> matchingGroceryItems = q.getResultList();

        session.getTransaction().commit();
        session.close();

        return matchingGroceryItems;
    }

    @Override
    public void addGroceryItem(GroceryItem groceryItem) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        session.save(groceryItem);

        session.getTransaction().commit();
        session.close();
    }
}