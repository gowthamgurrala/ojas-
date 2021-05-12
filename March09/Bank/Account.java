package Bank;

public class Account {

	Customer c;
	double balance=0;
	int accountNo;
	float interestRate;
	void deposit(int amount) {
		this.balance = balance+amount;
		System.out.println("Balance after Deposit "+this.balance);
	}
	void withdraw(int amount){
		
		if(amount>balance) {
			System.out.println("Insufficent Funds\n");
		}
		
		else {
			balance = balance-amount;
			System.out.println("Remaing balance"+balance);
		}
	}
}
