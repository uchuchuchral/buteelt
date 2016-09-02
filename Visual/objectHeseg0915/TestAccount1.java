package objectHeseg0915;

public class TestAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print(new Account1());
        
      SavingsAccount1 s1= new SavingsAccount1(12,5000);
        s1.withdraw(2000);
        s1.deposit(1000);
        print(s1);
        print(new CheckingAccount1(52,10000,5000));
		
	}
	
	public static void print(Object o){
		System.out.println(o.toString());
		System.out.println();
	}

}
