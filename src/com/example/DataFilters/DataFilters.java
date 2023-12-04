import java.time.LocalDate;
import java.util.*;

public class DataFilters{

    Database database;

    public DataFilters(Database database)
    {
        this.database = database;
    }

    public List<Member> ThirtyDaysFilter()
    {
        List<Member> memberList = new ArrayList<>();
        List<Member> entries = database.getEntries();
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysAgo = today.minusDays(30);
        System.out.println(thirtyDaysAgo);
        for(Member entry : entries)
        {
            String lastLogin = entry.getLastSignIn();
            System.out.println(lastLogin);
            if (lastLogin.equals(String.valueOf(thirtyDaysAgo))) 
            {
                memberList.add(entry);
            } 
        }
        return memberList;
    }
}
