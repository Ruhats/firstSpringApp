package com.bodev.entity;

import com.bodev.dao.UserDao;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public User(){}

    public User (String userName, String pw) {
        this.username = userName;
        this.password = BCrypt.hashpw(pw,BCrypt.gensalt(11));

    }

    public void registerNewUserAccount(UserDao userDao) { };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = BCrypt.hashpw(pw,BCrypt.gensalt(11));
    }

    }
