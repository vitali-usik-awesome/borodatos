package com.borodatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.AfishaDAO;
import com.borodatos.model.News;

/**
 * @author Vitali Usik
 *
 */
@Service
public class AfishaServiceImp implements AfishaService {

    @Autowired
    private AfishaDAO afishaDAO;
    
    @Transactional
    public List<News> listAfisha() {
        
        return afishaDAO.listAfisha();
    }

}
