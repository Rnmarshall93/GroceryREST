package com.groceryREST.groceryREST.Entity;

import java.sql.Timestamp;

public class VerifiedUser {
    private int id;
    private String username;
    private String email;
    private String password;
    private String accountLevel;
    private Timestamp dateCreated;
    private boolean accountActivated;

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

    public boolean isAccountActivated() {
        return accountActivated;
    }

    public void setAccountActivated(boolean accountActivated) {
        this.accountActivated = accountActivated;
    }

    public VerifiedUser(int id, String username, String email, String password, String accountLevel, Timestamp dateCreated, boolean accountActivated) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.accountLevel = accountLevel;
        this.dateCreated = dateCreated;
        this.accountActivated = accountActivated;
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
                ", accountActivated=" + accountActivated +
                '}';
    }
}