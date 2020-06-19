package com.bl.greeting.model;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "Username")
    private String username;

    @Column (name = "Password")
    private String password;

    @Column (name = "EmailId")
    private String emailid;

    public User() {
    }

    public User(int id, String username, String password, String emailid) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.emailid = emailid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
