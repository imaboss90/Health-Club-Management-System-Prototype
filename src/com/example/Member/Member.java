public class Member 
{
    int memberAge;
    String memberName;
    String memberId;
    String paymentMethod;
    String lastSignIn;
    String qrCodeId;
    String memberEmail;
    String expirationDate;


    public Member(int memberAge, String memberName, String memberId, String paymentMethod, String lastSignIn, String qrCodeId, String memberEmail, String expirationDate)
    {
        this.memberAge = memberAge;
        this.memberName = memberName;
        this.memberId = memberId;
        this.paymentMethod = paymentMethod;
        this.lastSignIn = lastSignIn;
        this.qrCodeId = qrCodeId;
        this.memberEmail = memberEmail;
        this.expirationDate = expirationDate;
    }

    public String toString()
    {
      String profile = "Member Name: "+memberName+"\nMember Age: "+memberAge+"\nMember ID: "+memberId+"\nPayment Method: "+paymentMethod+"\nLast Sign In: "+lastSignIn+"\nQR Code ID: "+qrCodeId+"\nMember Email: "+memberEmail+"\nExpiration Date"+expirationDate;
      return profile;
    }

    public int getMemberAge() { return memberAge; }
  
    public String getMemberName() { return memberName; }
  
    public String getMemberId() { return memberId; }
  
    public String getPaymentMethod() { return paymentMethod; }
  
    public String getLastSignIn() { return lastSignIn; }
  
    public String getQrCodeId() { return qrCodeId; }
  
    public String getMemberEmail() { return memberEmail; }
  
    public String getExpirationEmail() { return expirationDate; }

}
