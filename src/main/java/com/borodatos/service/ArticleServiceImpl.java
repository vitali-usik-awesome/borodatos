package com.borodatos.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.ArticleDAO;
import com.borodatos.model.Article;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

	private static Log log = LogFactory.getLog(ArticleServiceImpl.class);

	@Autowired
	private ArticleDAO articleDAO;

	@Transactional
	public List<Article> listArticle() {

		log.info("from service");
		return articleDAO.listArticle();
	}

}
