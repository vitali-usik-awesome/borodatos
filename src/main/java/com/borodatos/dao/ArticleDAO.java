package com.borodatos.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.borodatos.controller.HomeController;
import com.borodatos.model.Article;

@Repository
public class ArticleDAO {

	private static Log log = LogFactory.getLog(HomeController.class);
	
//	@Autowired
//    private SessionFactory sessionFactory;
//	
	@SuppressWarnings("unchecked")
	public List<Article> listArticle() {
		
		log.info("in dao");
		List<Article> articles = new ArrayList<Article>();
		Article a = new Article();
		a.setContent("test");
		articles.add(a);
		return articles;
//		return sessionFactory.getCurrentSession().createQuery("from Article")
//	            .list();
	}
	
}
