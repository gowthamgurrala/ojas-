package Padma_March09;

public class HistoryStudent extends Student{
	
	int historyMarks,civicsMarks;
	 
	
	
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	void getPercentage(){
		
		float total=((historyMarks+civicsMarks)/(float)300)*100;
	       System.out.println("History Student percentage ="+total);

	 }
}
