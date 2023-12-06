import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class DataFilters{

    Database database;
 
    public DataFilters(Database database)
    {
        this.database = database;
    }

    public List<User> ThirtyDaysFilter()
    {
        List<User> memberList = new ArrayList<>();
        List<User> entries = database.getEntries();
        LocalDate today = LocalDate.now();
        for(User entry : entries)
        {
            if(entry instanceof Member)
            {
              LocalDate lastLocalDateLogin = LocalDate.parse(entry.getLastSignIn());
              long days = ChronoUnit.DAYS.between(lastLocalDateLogin, today);
              if(days>=30)
              {
                memberList.add(entry);
              }
            }
        }
        return memberList;
    }
}
