package com.example.Database;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.Member.Member;
import com.example.User.User;

public class Database {
    private HashMap<User, String> database;
    private boolean loggedIn = false;

    public Database() {
        this.database = new HashMap<>();
    }

    public void populate() {
        Member iman = new Member(19, "Iman", String.valueOf(UUID.randomUUID()), "Visa", "2023-11-05", String.valueOf(UUID.randomUUID()), "isafari@outlook.com", "2023-08-04");
        Member zarak = new Member(25, "Zarak", String.valueOf(UUID.randomUUID()), "Chase", "2023-12-04", String.valueOf(UUID.randomUUID()), "zaraktariq@outlook.com", "2023-07-04");
        database.put(iman, "Member");
        database.put(zarak, "Member");
    }

    // Implement the getMember method
    public User getMember(String email) {
        for (User user : database.keySet()) {
            if (user instanceof Member && user.getEmail().equals(email)) {
                return user;
            }
        }
        return null; // Member not found
    }

    // Implement the addMember method
    public void addMember(Member member) {
        database.put(member, "Member");
    }

    // Other methods...

    @Override
    public String toString() {
        StringBuilder entries = new StringBuilder();
        for (User entry : database.keySet()) {
            entries.append(entry.toString()).append("\n\n");
        }
        return entries.toString();
    }

    public List<User> getEntries() {
        return new ArrayList<>(database.keySet());
    }

    public void setLoggedInTrue() {
        loggedIn = true;
    }
}
