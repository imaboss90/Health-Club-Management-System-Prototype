import java.util.*;

class Main {
  public static void main(String[] args) {
    Database database = new Database();
    database.populate();
    Member iman = database.getMember("Iman");
    MemberSignUp signUp = new MemberSignUp(database);
    signUp.form();
    System.out.println(database);
  }
}