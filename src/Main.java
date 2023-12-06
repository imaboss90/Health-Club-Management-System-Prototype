import java.util.*;

class Main {
  public static void main(String[] args) {
    Database database = new Database();
    database.populate();
    
    MemberSignUp signUp = new MemberSignUp(database);
    signUp.form();
    
    Manager honig = new Manager("Honig",String.valueOf( UUID.randomUUID()),"whonig@outlook.com","javaIsTerrible");
    database.addManager(honig);
    
    ManagerLogin ml = new ManagerLogin(database);
    ml.validate("whonig@outlook.com","javaIsTerrible");
    
    DataFilters df = new DataFilters(database);
    System.out.println(df.ThirtyDaysFilter());
    
    System.out.println();
    System.out.println(database);
  }
}