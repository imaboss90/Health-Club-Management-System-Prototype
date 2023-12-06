import java.util.*;

public class Database 
{
    HashMap<User, String> database;
    boolean loggedIn = false;
    
    public Database()
    { 
        this.database = new HashMap<>();
    }

    public void populate()
    {
        Member iman = new Member(19,"Iman",String.valueOf( UUID.randomUUID()),"Visa","2023-11-05",String.valueOf( UUID.randomUUID()),"isafari@outlook.com","2023-08-04");
        Member zarak = new Member(25,"Zarak",String.valueOf( UUID.randomUUID()),"Chase","2023-12-04",String.valueOf( UUID.randomUUID()),"zaraktariq@outlook.com","2023-07-04");
          database.put(iman,"Member");
          database.put(zarak,"Member");
      }

    public void addMember(Member newMember)
    {
      database.put(newMember,"Member");
    }

    public void addManager(Manager newManager)
    {
      database.put(newManager,"Manager");
    }

    public User getMember(String memberEmail)
    {
      for(User entry : database.keySet())
      {
        if(entry.getEmail().equals(memberEmail))
        {
          return entry;
        }
      }
      return null;
    } 

    public String toString() {
      String entries = "";
      for(User entry : database.keySet())
      {
          entries+=entry.toString()+"\n\n";
      }
      return entries;
    }

    public List<User> getEntries()
    {
      List<User> memberList = new ArrayList<>(database.keySet());
      return memberList;
    }

    public void setLoggedInTrue()
    {
      loggedIn = true;
    }
}
