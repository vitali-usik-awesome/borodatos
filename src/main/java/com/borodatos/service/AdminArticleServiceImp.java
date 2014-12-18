package com.borodatos.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
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
            // fucking shame, it's no work
//            int i = 0;
//            String link = article.getLink();
//            while (!adminArticleDAO.checkUniqueLink(link)) {
//                i++;
//                link += i;
//                System.out.println(i);
//            }
//            if (i > 0) {
//                article.setLink(article.getLink() + i);
//            }
            // fucking shame
            article.setViews(0);
        }
        if (article.getDate() == null) {
            article.setDate(new Date());
        }
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        article.setAuthor(user.getUsername());
        adminArticleDAO.saveArticle(article);
    }

    @Transactional
    public Article retrieveArticle(String link) {
        
        return adminArticleDAO.retrieveArticle(link);
    }
}
