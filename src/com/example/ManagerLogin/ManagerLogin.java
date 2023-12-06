package com.example.ManagerLogin;
import java.util.*;
import com.example.User.User;
import com.example.Database.Database;


public class ManagerLogin
{

  Database database;
  
  public ManagerLogin(Database database)
  {
    this.database = database; 
  }
  
  public void validate(String email, String password)
  {
    User manager = database.getMember(email);
    if(manager==null)
    {
      return;
    }
    if(manager.getManagerPassword().equals(password))
    {
      System.out.println("Logged in!");
      database.setLoggedInTrue();
    }
  }
}