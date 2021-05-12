package Assign5103;

public class Student {

	int studentId;
	String name;
	double examFee;
	void displayDetails() {
		
		
	}
	double payFee(){
		return 0;
	}
	public Student() {
	}
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	

}

