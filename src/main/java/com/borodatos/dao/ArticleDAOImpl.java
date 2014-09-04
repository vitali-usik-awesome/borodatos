package com.borodatos.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */

@Repository
public class ArticleDAOImpl implements ArticleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addArticle(Article article) {
		sessionFactory.getCurrentSession().save(article);
	}

	@SuppressWarnings("unchecked")
	public List<Article> listArticle() {
		
		return sessionFactory.getCurrentSession().createQuery("from Article")
	            .list();
	}

	public void removeArticle(Integer id) {
		Article article = (Article) sessionFactory.getCurrentSession().load(
				Article.class, id);
        if (null != article) {
            sessionFactory.getCurrentSession().delete(article);
        }

	}

}
