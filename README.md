# SEHealthClub Project

This repository contains the SEHealthClub project, a health club management system.

## Changes in Testing Branch

### Added Features

- Implemented the `getMember(String)` method in the `Database` class.
- Implemented the `addMember` method in the `Database` class.
- Resolved compilation errors and missing methods.
- Updated some java files.

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

## Project Structure

The project contains all functions inside the `com.example` package, containing the following classes:

- **Database:** Manages the storage and retrieval of member information.
- **DataFilters:** Implements filters for member data based on various criteria.
- **FreqSorter:** Sorts members by visit frequency, identifying the most frequent users.
- **Member:** Represents a club member with attributes such as name, age, email, etc.
- **MemberSignUp:** Handles the registration and sign-up process for new members.
- **TestingFile:** Contains code for testing various functionalities.

## ExcelReader Utility

This is a now a maven project; added a utility, `ExcelReader`, to facilitate reading data from Excel files. This utility uses Apache POI to parse Excel files and print the data to the console. It can be found in the `com.example.ExcelReader` package.

### Usage

To use the `ExcelReader` utility:

1. Ensure you have Apache POI added to your project dependencies (check the [pom.xml](pom.xml) file).
2. Run the `ExcelReader` class, and it will read and display data from the specified Excel file (`resources/50-sample-contacts-list-excel.xlsx`).
3. Customize the utility or integrate it into your project as needed.

Feel free to explore and modify the utility to suit your project requirements.

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/Isafarii/Health-Club-Management-System-Prototype.git
   ```

2. Open the project in your preferred IDE.

3. Customize and extend the code as needed based on project requirements.

## Testing Instructions

1. Compile your entire project to ensure all the latest changes are reflected.
2. Run your main application class or the class that contains the main method.

## Running the Project in IntelliJ

1. Open IntelliJ IDEA.
2. Open the SEHealthClub project.
3. Build the project by clicking on "Build" in the top menu and selecting "Build Project."
4. In the Project Explorer, locate the class containing the `main` method (e.g., `Main` class).
5. Right-click on the class file and select "Run <ClassName>.main()".

## Git Commands Used

```bash
git checkout testing
# Make changes, resolve errors, implement features
git add .
git commit -m "Implemented Database methods and resolved compilation errors"
git push origin testing
```

## Contributing

Feel free to contribute to the development of this project by forking the repository and submitting pull requests.

### Branching Workflow

To facilitate collaboration, it's recommended to create separate branches when working on new features or making changes. This way, you can update, change, or add things to your branch independently, and the team can review and integrate your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.