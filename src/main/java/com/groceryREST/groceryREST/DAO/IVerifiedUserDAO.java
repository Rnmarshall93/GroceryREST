package com.groceryREST.groceryREST.DAO;

import com.groceryREST.groceryREST.Entity.VerifiedUser;

public interface IVerifiedUserDAO {
    public String GetUser(String username, String password);
    public String UpdateUser(VerifiedUser user);
}
