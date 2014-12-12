package com.borodatos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Article;
import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class NewsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<News> listNews() {
        
        return sessionFactory.getCurrentSession().createQuery("FROM News WHERE status = 'public' ORDER BY date DESC").setMaxResults(9).list();
    }

    public void saveComics(News news) {

        sessionFactory.getCurrentSession().saveOrUpdate(news);
        
    }

    @SuppressWarnings("unchecked")
    public List<News> listAllNews() {

        return sessionFactory.getCurrentSession().createQuery("FROM News ORDER BY date DESC").list();
    }

    public News retrieveNews(String id) {
        News news = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM News WHERE id = :id");
        q.setString("id", id);
        news = (News) q.uniqueResult();
        
        return news;
    }
    
}
