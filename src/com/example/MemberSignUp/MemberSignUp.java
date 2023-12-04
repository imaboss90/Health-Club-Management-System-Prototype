import java.util.*;
import java.time.*;

public class MemberSignUp
{
    Database database;
    public MemberSignUp(Database database)
    {
      this.database = database;
    }
    public void form()
    {

      int memberAge = 0;
      String memberName = "";
      String memberId = "";
      String paymentMethod = "";
      String lastSignIn = "";
      String qrCodeId = "";
      String memberEmail = "";
      String expirationDate = "";

      boolean validated = false;
      
      Scanner scan = new Scanner(System.in);
      while(!validated)
      {
        System.out.println("Enter your name: ");
        memberName = scan.next();
        System.out.println("Enter your age: ");
        memberAge = scan.nextInt();
        System.out.println("Enter your payment method: ");
        paymentMethod = scan.next();
        System.out.println("Enter your email: ");
        memberEmail = scan.next();
        validated = validateFields(memberName,memberAge,paymentMethod,memberEmail);
      }
      expirationDate = calculateEndDate();
      lastSignIn = String.valueOf(LocalDate.now());
      List<String> ids = createIDandQR();
      memberId = ids.get(0);
      qrCodeId = ids.get(1);
      scan.close();
      inputIntoDatabase(memberAge,memberName,memberId,paymentMethod,lastSignIn,qrCodeId,memberEmail,expirationDate);
      System.out.println("All signed up!");
    } 
  
    public String calculateEndDate()
    {
      LocalDate today = LocalDate.now();
      LocalDate nextMonth = today.plusDays(30);
      System.out.println(nextMonth);
      return String.valueOf(nextMonth);
    }

    public boolean validateFields(String name, int age, String pay, String email)
    {
      if(name.equals("") || age==0 || pay.equals("") || email.equals(""))
      {
        return false;
      }
      return true;
    }

    public List<String> createIDandQR()
    {
      List<String> idAndQR = new ArrayList<String>();
      UUID memberId = UUID.randomUUID();
      UUID qrCodeId = UUID.randomUUID();
      idAndQR.add(String.valueOf(memberId));
      idAndQR.add(String.valueOf(qrCodeId));
      return idAndQR;
    }

    public void inputIntoDatabase(int memberAge,String memberName,String memberId,String paymentMethod,String lastSignIn,String qrCodeId,String memberEmail,String expirationDate)
    {
      Member newMember = new Member(memberAge,memberName,memberId,paymentMethod,lastSignIn,qrCodeId,memberEmail,expirationDate);
      database.addMember(newMember);
    }

  
}
