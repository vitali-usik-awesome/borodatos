package com.borodatos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vitali Usik
 *
 */
@Entity
@Table(name = "HUSERS")
public class User {

    public User() {
    }
    
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;
    
    @Column(name = "USER_NAME")
    private String name;
    
    @Column(name = "USER_SURNAME")
    private String surname;
    
    @Column(name = "USER_NICKNAME")
    private String nickName;
    
    @Column(name = "USER_PASSWORD")
    private String password;
    
    @Column(name = "USER_ROLE")
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
