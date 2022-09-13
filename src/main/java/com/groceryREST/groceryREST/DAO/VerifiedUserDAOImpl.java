package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.GroceryItem;
import com.groceryREST.groceryREST.Entity.VerifiedUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

@Component
public class VerifiedUserDAOImpl implements IVerifiedUserDAO{
    @Autowired
    Configuration configuration;

    @Override
    public VerifiedUser getUser(String username, String password) {
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Query q = session.createQuery("FROM VerifiedUser v WHERE v.username = :username AND v.password = :password");
        q.setParameter("username", username);
        q.setParameter("password", password);

        VerifiedUser foundUser = (VerifiedUser) q.getSingleResult();

        session.getTransaction().commit();
        session.close();

        return foundUser;
    }

    @Override
    public void updateUser(VerifiedUser user) {
    }
}