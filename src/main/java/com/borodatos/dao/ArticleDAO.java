package com.borodatos.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.ComicsArticle;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class ArticleDAO {

	private static Log log = LogFactory.getLog(ArticleDAO.class);
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<ComicsArticle> listComics() {
		return sessionFactory.getCurrentSession().createQuery("from ComicsArticle").list();
	}

	public ComicsArticle retriveComics(String link) {
		ComicsArticle comicsArticle = null;
		Query q = sessionFactory.getCurrentSession().createQuery("from ComicsArticle where link = :link");
		q.setString("link", link);
		comicsArticle = (ComicsArticle) q.uniqueResult();
		Integer viewPlus = comicsArticle.getViews() + 1;
		comicsArticle.setViews(viewPlus);
		sessionFactory.getCurrentSession().saveOrUpdate(comicsArticle);
		
		return comicsArticle;
	}

	public void saveComics(ComicsArticle comics) {
		sessionFactory.getCurrentSession().saveOrUpdate(comics);
		
	}
}
