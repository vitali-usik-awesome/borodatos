package com.borodatos.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.controller.HomeController;
import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;

@Repository
public class ArticleDAO {

	private static Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<ComicsArticle> listComics() {
		return sessionFactory.getCurrentSession().createQuery("from ComicsArticle").list();
	}

	public ComicsArticle retriveUser(String link) {
		Query q = sessionFactory.getCurrentSession().createQuery("from ComicsArticle where link = :link");
		q.setString("link", link);
		return (ComicsArticle) q.uniqueResult();
	}
}
