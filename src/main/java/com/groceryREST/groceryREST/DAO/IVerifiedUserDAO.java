package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.VerifiedUser;

public interface IVerifiedUserDAO {
    public verifiedUser GetUser(String username, String password);
    public void updateUser(VerifiedUser user);
}
