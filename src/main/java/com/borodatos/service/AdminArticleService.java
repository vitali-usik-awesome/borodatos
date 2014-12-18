package com.borodatos.service;

import com.borodatos.model.Article;

/**
 * @author Vitali Usik
 *
 */
public interface AdminArticleService {

    /**
     * @param article
     */
    public void saveArticle(Article article);

    /**
     * @param link
     * @return
     */
    public Article retrieveArticle(String link);
    
}
