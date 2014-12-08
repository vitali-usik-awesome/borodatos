package com.borodatos.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 * 
 */
@Repository
public class AdminArticleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveComics(Article article) {

        sessionFactory.getCurrentSession().saveOrUpdate(article);

    }
}
