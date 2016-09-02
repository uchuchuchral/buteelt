package bodlogo11_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CheckingAccount ch= new CheckingAccount();
      ch.withdraw(1500);
      
      SavingsAccount s= new SavingsAccount();
      s.withdraw(500);
      
      System.out.println(s.toString());
	}

}
