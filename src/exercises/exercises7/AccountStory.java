package exercises.exercises7;

public class AccountStory {

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account bob = new Account(100);
		Account sue = new Account(200);		
		sue.deposit(50);		
		System.out.println("Sue " + sue.getBalance());		
		Account charles = new Account(sue.getBalance());		
		System.out.println("Charles " + charles.getBalance());
		if (bob.withdraw(0)) {
			System.out.println("Worked");
		}
		
		else {
			System.out.println("insufficient funds");
		}
		System.out.println("Bob's balance = " + bob.getBalance());
		
		System.out.println();		

		sue.transfer(charles, 150);
		System.out.println("Sue " + sue.getBalance());		
		System.out.println("Charles " + charles.getBalance());		

	}

}
