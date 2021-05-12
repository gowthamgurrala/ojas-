package Padma_March09;

public class ScienceStudent extends Student{
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
		public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

		void getPercentage() {
			float total=((physicsMarks+chemistryMarks+mathsMarks)/(float)300)*100;
			   
		       System.out.println("Science Student percentage ="+total);
		}
	
}
