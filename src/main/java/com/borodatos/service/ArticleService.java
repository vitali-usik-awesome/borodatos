package com.borodatos.service;

import java.util.List;

import com.borodatos.model.Article;
import com.borodatos.model.ComicsArticle;

public interface ArticleService {

	public List<Article> listArticle();

	public List<ComicsArticle> listComics();

}
