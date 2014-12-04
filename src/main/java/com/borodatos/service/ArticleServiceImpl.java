package com.borodatos.service;

import java.sql.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.ArticleDAO;
import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;

/**
 * @author Vitali Usik
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	private static Log log = LogFactory.getLog(ArticleServiceImpl.class);

	@Autowired
	private ArticleDAO articleDAO;

	@Transactional
	public void saveComics(ComicsArticle comics) {
	    if (comics.getViews() == null) {
            comics.setViews(0);
        }
	    if (comics.getDate() == null) {
	        Date date = new Date(System.currentTimeMillis());
	        comics.setDate(date);
	    }
	    
		articleDAO.saveComics(comics);
	}

	@Transactional
	public void removeComics(Integer id) {
		
		articleDAO.removeComics(id);
	}

	// collects popular articles
	/* (non-Javadoc)
	 * @see com.borodatos.service.ArticleService#listPopular()
	 */
	@Transactional
    public List<Article> listPopular() {
        
        return articleDAO.listPopular();
    }
	
	// colect latest comics articles
	/* (non-Javadoc)
	 * @see com.borodatos.service.ArticleService#listComics()
	 */
	@Transactional
    public List<ComicsArticle> listComics() {
        
        return articleDAO.listComics();
    }
	
	// take an article on link
	/* (non-Javadoc)
	 * @see com.borodatos.service.ArticleService#retrieveComics(java.lang.String)
	 */
	@Transactional
    public Article retrieveComics(String link) {
        
        return articleDAO.retriveComics(link);
    }

}
