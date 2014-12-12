package com.borodatos.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.NewsDAO;
import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;
    
    @Transactional
    public List<News> listNews() {
        
        return newsDAO.listNews();
    }

    @Transactional
    public void saveNews(News news) {
        if (news.getDate() == null) {
            news.setDate(new Date());
        }
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        news.setAuthor(user.getUsername());
        newsDAO.saveComics(news);
    }

    @Transactional
    public List<News> listAllNews() {
        
        return newsDAO.listAllNews();
    }

    @Transactional
    public News retrieveArticle(String id) {
        
        return newsDAO.retrieveNews(id);
    }

}
