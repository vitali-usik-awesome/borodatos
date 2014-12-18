package com.borodatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.borodatos.dao.AfishaDAO;
import com.borodatos.model.Afisha;
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

    @Transactional
    public void saveAfisha(Afisha afisha) {
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        afisha.setAuthor(user.getUsername());
        afishaDAO.saveAfisha(afisha);        
    }

    @Transactional
    public List<Afisha> listAllAfisha() {
        
        return afishaDAO.listAllAfisha();
    }

    @Transactional
    public Afisha retrieveAfisha(String id) {
        
        return afishaDAO.retrieveAfisha(id);
    }

}
