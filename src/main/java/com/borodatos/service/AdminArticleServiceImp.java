package com.borodatos.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.AdminArticleDAO;
import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */
@Service
public class AdminArticleServiceImp implements AdminArticleService {

    @Autowired
    private AdminArticleDAO adminArticleDAO;
    
    @Transactional
    public void saveArticle(Article article) {
        if (article.getViews() == null) {
            article.setViews(0);
        }
        if (article.getDate() == null) {
            Date date = new Date(System.currentTimeMillis());
            article.setDate(date);
        }
        
        adminArticleDAO.saveComics(article);

    }

}
