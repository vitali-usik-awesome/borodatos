package com.borodatos.service;

import java.util.List;

import com.borodatos.model.ComicsArticle;

public interface ArticleService {

	public List<ComicsArticle> listComics();

	public ComicsArticle retrieveComics(String link);

}
