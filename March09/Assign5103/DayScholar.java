package Assign5103;

public class DayScholar extends Student{

	double transportFee;
	public DayScholar() {
	
	}
	public DayScholar(int studentId, String name, double examFee,double transportFee) {
		super(studentId,name,examFee);
		this.transportFee = transportFee;
	}
	void displayDetails(){
		System.out.println("name = "+this.name);
		System.out.println("id = "+this.studentId);
		System.out.println("examfee = "+this.examFee);
		System.out.println("transport = "+this.transportFee);
	}
		
	int payFee(int amount){
		int balance=1500;
		if(amount<1500) {
			System.out.println(balance-amount);
		}
		else {
			System.out.println(balance-amount);
		}
		
		
			return 0;
	}
	
	
}
