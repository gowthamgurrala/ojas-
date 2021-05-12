package Bank;

import java.util.Scanner;

public class Driver_class {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Account ac = new Account(); 
		System.out.println("WELCOME to Banking \n");
		System.out.println("Enter the First name:\n");		
		String fname=sc.next();
		System.out.println("Enter the Second name \n");
		String lname=sc.next();
		Customer c1 = new Customer(fname,lname);
		System.out.println("Hello "+c1.firstName+" "+c1.lastName+"\n ");		
		String res="Choose options\n"
					+"1.Deposite\n"	
					+"2.Withdraw\n"	
					+"3.Exit\n";
		
		while(true) {
		System.out.println(res);
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println("Enter the amout to deposit\n");
			ac.deposit(sc.nextInt());	
			break;
		case 2:
			System.out.println("Ener the amount to Withdraw \n");
			ac.withdraw(sc.nextInt());
			break;
		case 3:
			System.exit(0);
			
		default:
			break;
		} // switch closing
	}
	}
}
