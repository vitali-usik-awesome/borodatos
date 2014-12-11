package com.borodatos.service;

import java.util.List;

import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
public interface NewsService {

    /**
     * shows only 9 news for users on home page
     * @return
     */
    public List<News> listNews();

    /**
     * @param news
     */
    public void saveNews(News news);

    /**
     * shows all news only for admin
     * @return
     */
    public List<News> listAllNews();
    
}
