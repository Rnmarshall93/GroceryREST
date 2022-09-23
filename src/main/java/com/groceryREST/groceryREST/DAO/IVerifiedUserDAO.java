package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.VerifiedUser;

public interface IVerifiedUserDAO {
    public VerifiedUser getUserByUsername(String username, String password);
    public VerifiedUser getUserByEmail(String email, String password);
    public void updateUser(VerifiedUser user);
    public void createUser(String username, String Password);
    public void validateEmail(String username);
}
