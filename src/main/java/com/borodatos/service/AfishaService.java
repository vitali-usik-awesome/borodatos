package com.borodatos.service;

import java.util.List;

import com.borodatos.model.Afisha;
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

    /**
     * @param afisha
     */
    public void saveAfisha(Afisha afisha);

    /**
     * @return
     */
    public List<Afisha> listAllAfisha();

    /**
     * @param id
     * @return
     */
    public Afisha retrieveAfisha(String id);

}
