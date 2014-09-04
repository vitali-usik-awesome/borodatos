package com.borodatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.ArticleDAO;
import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDAO articleDAO;
	
	@Transactional
	public void addArticle(Article article) {
		articleDAO.addArticle(article);

	}

	@Transactional
	public List<Article> listArticle() {
		
		return articleDAO.listArticle();
	}

	@Transactional
	public void removeArticle(Integer id) {
		articleDAO.removeArticle(id);

	}

}
