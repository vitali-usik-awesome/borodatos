package com.borodatos.dao;

import java.util.List;

import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */
public interface ArticleDAO {

	public void addArticle(Article article);

    public List<Article> listArticle();

    public void removeArticle(Integer id);
    
}
