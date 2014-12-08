package com.borodatos.dao;

import org.hibernate.Query;
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

    /**
     * @param article
     */
    public void saveComics(Article article) {

        sessionFactory.getCurrentSession().saveOrUpdate(article);

    }

    /**
     * @param link
     * @return
     */
    public boolean checkUniqueLink(String link) {
        boolean unique = true;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Article WHERE link = :link");
        q.setString("link", link);
        if (q.uniqueResult() != null) {
            unique = false;
        }
        
        return unique;
    }
}
