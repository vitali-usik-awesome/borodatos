package com.borodatos.service;

import java.util.List;

import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
public interface AfishaService {

    /**
     * shows only 6 afishas for users on home page
     * @return
     */
    public List<News> listAfisha();

}
