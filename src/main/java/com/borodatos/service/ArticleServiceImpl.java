package com.borodatos.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.ArticleDAO;
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
	public List<ComicsArticle> listComics() {
		
		return articleDAO.listComics();
	}

	@Transactional
	public ComicsArticle retrieveComics(String link) {
		
		return articleDAO.retriveComics(link);
	}

	@Transactional
	public void saveComics(ComicsArticle comics) {
		
		articleDAO.saveComics(comics);
	}

}
