import java.util.*;

public class Database 
{
    List<Member> database;

    public Database()
    {
        this.database = new ArrayList<>();
    }

    public void populate()
    {
      Member iman = new Member(19,"Iman","123","Visa","10/28/23","456","isafari@outlook.com","12/05/23");
      Member zarak = new Member(25,"Zarak","6238","Chase","9/14/18","484","zaraktariq@outlook.com","11/27/23");
        database.add(iman);
        database.add(zarak);
      }

    public void addMember(Member newMember)
    {
      database.add(newMember);
    }

    public Member getMember(String memberName)
    {
      for(Member entry : database)
      {
        if(entry.getMemberName().equals(memberName))
        {
          return entry;
        }
      }
      return null;
    }

    public String toString() {
      String entries = "";
      for(Member entry : database)
      {
        entries+=entry.toString()+"\n\n";
      }
      return entries;
    }
}
