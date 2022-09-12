package com.groceryREST.groceryREST.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "VerifiedUser")
public class VerifiedUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "accountLevel")
    private String accountLevel;
    @Column(name = "dateCreated")
    private Timestamp dateCreated;
    @Column(name = "activated")
    private boolean isActivated;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public VerifiedUser() {
    }

    @Override
    public String toString() {
        return "VerifiedUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", accountLevel='" + accountLevel + '\'' +
                ", dateCreated=" + dateCreated +
                ", isActivated=" + isActivated +
                '}';
    }
}