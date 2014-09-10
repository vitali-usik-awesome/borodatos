package com.borodatos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Article;
import com.borodatos.mvc.home.HomeController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

@Repository
public class ArticleDAO {

	private static Log log = LogFactory.getLog(HomeController.class);
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Article> listArticle() {
		
		log.info("in dao");
		return sessionFactory.getCurrentSession().createQuery("from Article")
	            .list();
	}
	
}
