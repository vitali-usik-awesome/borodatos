package com.borodatos.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

}
