package com.borodatos.service;

import java.util.List;

import com.borodatos.model.ComicsArticle;

/**
 * @author Vitali Usik
 *
 */
public interface ArticleService {

	public List<ComicsArticle> listComics();

	public ComicsArticle retrieveComics(String link);

	public void saveComics(ComicsArticle comics);

	public void removeComics(Integer id);

}
