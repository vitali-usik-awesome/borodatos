package com.borodatos.service;

import java.util.HashMap;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.borodatos.model.User;

@Service
public class UserManager {

    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<String, User>();
        users.put("john", new User(1, "john", "boroda", "beard", "ololo", "ROLE_ADMIN"));
        //users.put("bob", new User("bob", "2", "ROLE_USER, ROLE_ADMIN"));
    }
    
    public User getUser(String username) throws UsernameNotFoundException{
        if( !users.containsKey( username ) ){
            throw new UsernameNotFoundException( username + " not found" );
        }
        
        return users.get( username );       
    }
}
