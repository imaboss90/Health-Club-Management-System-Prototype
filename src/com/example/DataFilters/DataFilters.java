package com.example.DataFilters;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import com.example.User.User;
import com.example.Database.Database;
import com.example.Member.Member;


public class DataFilters {

    Database database;

    public DataFilters(Database database) {
        this.database = database;
    }

    public List<User> ThirtyDaysFilter() {
        List<User> memberList = new ArrayList<>();
        List<User> entries = database.getEntries();
        LocalDate today = LocalDate.now();
        for (User entry : entries) {
            if (entry instanceof Member) {
                LocalDate lastLocalDateLogin = LocalDate.parse(entry.getLastSignIn());
                long days = ChronoUnit.DAYS.between(lastLocalDateLogin, today);
                if (days >= 30) {
                    memberList.add(entry);
                }
            }
        }
        return memberList;
    }
}
