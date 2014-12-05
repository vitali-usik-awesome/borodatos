package com.borodatos.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.borodatos.model.Article;
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

	public void saveComics(ComicsArticle comics) {
	    
		sessionFactory.getCurrentSession().saveOrUpdate(comics);
		
	}

	public void removeComics(Integer id) {
		ComicsArticle comics = (ComicsArticle) sessionFactory.getCurrentSession().load(
                ComicsArticle.class, id);
        if (null != comics) {
            sessionFactory.getCurrentSession().delete(comics);
        }
		
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
    public List<Article> listPopular() {
        
        return sessionFactory.getCurrentSession().createQuery("FROM Article WHERE priority = 'pop' ORDER BY date DESC").setMaxResults(5).list();
    }
	
	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
    public List<ComicsArticle> listComics() {
        return sessionFactory.getCurrentSession().createQuery("FROM Article WHERE section = 'comics' ORDER BY date DESC").setMaxResults(5).list();
    }
	
	/**
	 * @param link
	 * @return
	 */
	public Article retriveComics(String link) {
        Article article = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Article WHERE link = :link");
        q.setString("link", link);
        article = (Article) q.uniqueResult();
        Integer viewPlus = article.getViews() + 1;
        article.setViews(viewPlus);
        sessionFactory.getCurrentSession().saveOrUpdate(article);
        
        return article;
    }

}
