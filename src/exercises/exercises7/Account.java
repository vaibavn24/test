package exercises.exercises7;

public class Account {   //specifies the name of the object type, name must
						 //agree with filename shown in package explorer

	// An Account "has-a" balance
	
	private int balance;   //instance variables are usually declared private, so that they can
					       //only be accessed within a method
							
							//"live between methods", methods can read and write them
							//their values persist after methods return
	
							// they are the "has-a"s of object oriented design
	
	
	
	// open account with initial balance
	public Account (int initialBal) {   //constructor has the same name as the object type (Account in this case)
										//takes in parameters, but has no return type
										//it is responsible for giving birth to the object
											//inside the code of the constructor, can be any statements we like
										//purpose of constructors is to initialize instance variables
		
		
		this.balance = initialBal; 		//this assignment statement initializes the instance variable balance
	}
	
	
	
	
	public int getBalance() {
		return this.balance;        
		
		
		
									//instance variables usually started with "this."
									//declared outside of any method
									//usually have private in their declaration
	}
	
	public void deposit(int funds) {				//deposits money, changes value of balance instance variable
		this.balance = this.balance + funds;		//mutator
	}
		
	public boolean withdraw(int funds) {				//deposits money, changes value of balance instance variable
		
		if ((this.balance-funds)<0) {
			return false;
		}
		else {
			this.balance = this.balance - funds;		//mutator
			return true;
		}
	}
	
	public void transfer (Account a, int funds) {
		if (this.balance>=funds) {
			withdraw(funds);
			a.deposit(funds);
		}
		else {
			System.out.println("insufficient funds");
		}		
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acct1 = new Account(100);   //causes this constructor to initialize the account balance to 100		
		Account acct2 = new Account(50);		
		// Declarations are just like type types we have already studied
		// type name = initial value
		
		// by saying new Account(...) we run the constructor for the Account object
		
		// constructor is like a cookie cutter
		// each new "cookie" has a balance specified
		
		
		
		acct1.deposit(35);
		// "acct1." takes the place of "this."		
		System.out.println("Balance 1 " + acct1.getBalance());		
		Account acct3 = new Account(acct2.getBalance()*3);
		System.out.println("Balance 3 " + acct3.getBalance());

		
	}
}
