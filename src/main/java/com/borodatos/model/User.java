package com.borodatos.model;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Vitali Usik
 *
 */
@Entity
@Table(name = "HUSERS")
public class User implements UserDetails {

    /**
     * 
     */
    private static final long serialVersionUID = -1731069088815164013L;

    public User() {
    }
    
    public User(Integer id, String name, String surname, String nickName, String password, String role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.nickName = nickName;
        this.password = password;
        this.role = role;
        this.setRoles(role);
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
    
    private Collection<GrantedAuthority> authorities;

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

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    public String getUsername() {
        return nickName;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
    
    public void setRoles(String roles) {
        this.authorities = new HashSet<GrantedAuthority>();
        for (final String role : roles.split(",")) {
            if (role != null && !"".equals(role.trim())) {
                GrantedAuthority grandAuthority = new GrantedAuthority() {
                    private static final long serialVersionUID = 3958183417696804555L;

                    public String getAuthority() {
                        return role.trim();
                    }
                };
                this.authorities.add(grandAuthority);
            }
        }
    }
}
