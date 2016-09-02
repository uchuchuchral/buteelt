package geriinDaalgavruud;

public class AccountNewTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AccountNew n= new AccountNew("George",1122, 1000);
        n.deposit(30);
        n.deposit(40);
        n.deposit(50);
        
        n.withdraw(5);
        n.withdraw(4);
        n.withdraw(2);
        
        n.ShowAll();
	}

}
