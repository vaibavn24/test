package exercises.exercises7;

public class ObjectPlacement {

	// each Account
	// has-a balance
	// has-a interest rate
	
	public static void foo() {
	
	Account a1 = new Account(100);
	Account a2 = new Account(30);
	Account a3 = a1;
	Account a4 = new Account(10);

	a1 = null;
	
}
}