# SoftEng Health Club Management System

## Overview

SoftEng Health Club Management System is a software prototype designed to streamline the membership management process for a health or exercise club called SoftEng. This system allows efficient tracking of membership details, member attendance, renewal notifications, and generation of various reports for the club manager.

## Contributors

- Scrib Goode
- Daniel Gaevskiy
- Iman Safari
- Rue Yin Hu
- Ryan Walentowicz
- Zarak Tariq

## Functional Needs Statement

SoftEng Health Club operates with a membership model where users pay an upfront fee for a specified duration, granting them unlimited access during that period. Memberships range from 6 months to 3 years, with varying prorated fees.

Key Features:
- Unique ID number generated upon registration.
- QRCodeID for quick member identification.
- Recording and notification of member visits.
- Membership renewal on the spot.
- Monthly renewal notices.
- Manager reports for inactive members and other analytics.
- Email notifications for membership expiration and promotions.

## Code Outline

### Classes

1. **Member Class:**
    - Attributes: name, age, email, memberID, QRCodeID, membershipLength, membershipEndDate, expiredMember.

2. **Manager Class:**
    - Attributes: email, password, phone.

3. **System Class:**
    - Attributes: database, loginScreen, signUpSheet, homePage, scanInTab.

### Data Filters Implementation

```java
public class DataFilters {
    private List<Member> members;

    public DataFilters(List<Member> members) {
        this.members = members;
    }

    // TODO: Implement apply_30_days_filter, most_frequent_users_list, search_members methods
}

// Example usage:
List<Member> allMembers = [...]  // List of Member objects
DataFilters filters = new DataFilters(allMembers);
List<Member> filteredMembers = filters.apply_30_days_filter();
List<Member> topFrequentMembers = filters.most_frequent_users_list();
List<Member> searchResult = filters.search_members("John Doe");
