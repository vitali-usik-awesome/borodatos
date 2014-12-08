package com.borodatos.service;

import java.util.List;

import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;

/**
 * @author Vitali Usik
 *
 */
public interface ArticleService {

    public List<Article> listPopular();
    
	public List<ComicsArticle> listComics();
	
	public Article retrieveArticle(String section, String link);

	public void saveComics(ComicsArticle comics);

	public void removeComics(Integer id);

}
