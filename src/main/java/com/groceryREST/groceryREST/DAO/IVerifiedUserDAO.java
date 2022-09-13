package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.VerifiedUser;

public interface IVerifiedUserDAO {
    public VerifiedUser getUser(String username, String password);
    public void updateUser(VerifiedUser user);
}
