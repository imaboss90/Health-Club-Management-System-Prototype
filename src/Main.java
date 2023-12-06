import com.example.Database.Database;
import com.example.MemberSignUp.MemberSignUp;
import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    // Create a database instance
    Database database = new Database();

    // Populate the database with initial data
    database.populate();

    // Create an instance of MemberSignUp
    MemberSignUp signUp = new MemberSignUp(database);

    // Perform sign-up operations
    signUp.form();

    // Print the updated database
    System.out.println(database);
  }
}
