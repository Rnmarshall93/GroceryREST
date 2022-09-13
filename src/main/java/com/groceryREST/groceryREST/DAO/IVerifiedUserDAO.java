package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.VerifiedUser;

public interface IVerifiedUserDAO {
    public VerifiedUser GetUser(String username, String password);
    public void UpdateUser(VerifiedUser user);
}
