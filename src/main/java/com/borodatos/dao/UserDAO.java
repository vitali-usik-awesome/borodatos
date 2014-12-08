package com.borodatos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.borodatos.model.User;

/**
 * @author Vitali Usik
 * 
 */
@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    public User findByUserName(String username) throws UsernameNotFoundException {

        List<User> users = new ArrayList<User>();
        users = sessionFactory.getCurrentSession().createQuery("from User where username=?").setParameter(0, username).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
