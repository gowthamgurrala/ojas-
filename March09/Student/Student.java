package March09;

public class Student {
	public int studentId;
	public String studentName;
	private int Marks;
	private int grade;
	
	public String displayDetails() {
		
		System.out.println();
		
		String res="";
		
		return res;
	}
	
	
	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Marks=" + Marks + ", grade="
				+ grade + "]";
	}
	
//	public Student() {
//	
//	}
	
	void  calculateGrade(int marks) {
		String res="";
		 if(marks>=90){
			 System.out.println("A Grade");		 
			 }
		    else if(marks>=80 && marks>90 ){
		    	System.out.println("Grade B");
		    	}
		    else if(marks>=70 && marks<80){
		    	System.out.println("Grade C");
		    	}
		    else if(marks>=60 && marks<70){
		    	System.out.println("Grade D");
		    }
		    else if(marks<60){
		    	System.out.println("Grade E");
		    }
		    else if(marks>=80 && marks<90){
		        System.out.println("Grade A");
		    }
		    else{
		    System.out.println("Fail");	
		    }
		
	}
}
