package com.borodatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.NewsDAO;
import com.borodatos.model.News;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDAO newsDao;
	
	@Transactional
	public void addNews(News news) {
		newsDao.addNews(news);
	}

	@Transactional
	public List<News> listNews() {
		return newsDao.listNews();
	}

	@Transactional
	public void removeNews(Integer id) {
		newsDao.removeNews(id);
	}

}
