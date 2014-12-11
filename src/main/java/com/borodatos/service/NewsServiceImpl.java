package com.borodatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.NewsDAO;
import com.borodatos.model.News;

/**
 * @author Vitali_Usik
 *
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAO newsDAO;
    
    /* (non-Javadoc)
     * @see com.borodatos.service.NewsService#listNews()
     */
    @Transactional
    public List<News> listNews() {
        
        return newsDAO.listNews();
    }

}
