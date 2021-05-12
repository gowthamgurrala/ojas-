package PadmaGandla;

public class exc1 {
		
			
		static	void luckysum(int a,int b,int c) {
			if(a==13) {
			System.out.println(0);
			}
			else if (b==13) {
				System.out.println(a);
			}
			else if (c==13) {
				System.out.println(a+b);	
			}
			else {
				System.out.println(a+b+c);			
			}
		
			}
		
	public static void main(String[] args) {
		luckysum(13,13,0);
		
	}
}
