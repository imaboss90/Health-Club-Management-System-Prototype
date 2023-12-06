package com.example.Manager;
import com.example.User.User;
public class Manager extends User
{
    String managerName;
    String managerId;
    String managerEmail;
    String managerPassword; 


    public Manager(String managerName, String managerId, String managerEmail, String managerPassword)
    {
        this.managerName = managerName;
        this.managerId = managerId;
        this.managerEmail = managerEmail;
        this.managerPassword = managerPassword;
    }

    public String toString()
    {
      String profile = "Manager Name: "+managerName+"\nManager Id: "+managerId+"\nManager Email: "+managerEmail+"\nManager Password: "+managerPassword;
      return profile;
    }

    public String getManagerName() { return managerName; }

    public String getManagerId() { return managerId; }
  
    public String getEmail() { return managerEmail; }

    public String getManagerPassword() { return managerPassword; }

    public void setPassword(String newPassword) { managerPassword = newPassword; }
}
