package com.borodatos.service;

import java.util.List;

import com.borodatos.model.News;

public interface NewsService {

	public void addNews(News news);

    public List<News> listContact();

    public void removeNews(Integer id);
    
}
