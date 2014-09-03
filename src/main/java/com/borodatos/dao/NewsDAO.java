package com.borodatos.dao;

import java.util.List;

import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
public interface NewsDAO {

	public void addNews(News news);

    public List<News> listNews();

    public void removeNews(Integer id);
}
