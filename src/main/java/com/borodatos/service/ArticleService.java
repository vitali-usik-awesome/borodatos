package com.borodatos.service;

import java.util.List;

import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */
public interface ArticleService {

	public void addArticle(Article article);

    public List<Article> listArticle();

    public void removeArticle(Integer id);
}
