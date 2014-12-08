package com.borodatos.service;

import java.sql.Date;

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
            int i = 0;
            String link = article.getLink();
            while (!adminArticleDAO.checkUniqueLink(link)) {
                i++;
                link += i;
                System.out.println(i);
            }
            if (i > 0) {
                article.setLink(article.getLink() + i);
            }
            // fucking shame
            article.setViews(0);
        }
        if (article.getDate() == null) {
            Date date = new Date(System.currentTimeMillis());
            article.setDate(date);
        }
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUsername());
        article.setAuthor(user.getUsername());
        adminArticleDAO.saveComics(article);

    }

}
