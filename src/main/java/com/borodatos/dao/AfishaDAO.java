package com.borodatos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Afisha;
import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class AfishaDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @SuppressWarnings("unchecked")
    public List<News> listAfisha() {
        
        return sessionFactory.getCurrentSession().createQuery("FROM Afisha WHERE status = 'public' ORDER BY id DESC").setMaxResults(6).list();
    }

    public void saveAfisha(Afisha afisha) {
        
        sessionFactory.getCurrentSession().saveOrUpdate(afisha);
    }

    @SuppressWarnings("unchecked")
    public List<Afisha> listAllAfisha() {

        return sessionFactory.getCurrentSession().createQuery("FROM Afisha ORDER BY id DESC").list();
    }

    public Afisha retrieveAfisha(String id) {
        Afisha afisha = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Afisha WHERE id = :id");
        q.setString("id", id);
        afisha = (Afisha) q.uniqueResult();
        
        return afisha;
    }

}
