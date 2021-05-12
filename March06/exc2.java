package PadmaGandla;

public class exc2 {

	static int sumDigits(String str) {
		
	int len=str.length();
	int sum=0;
	for (int i = 0; i < len; i++) {
		if (Character.isDigit(str.charAt(i))) {
			String temp=str.substring(i,i+1);
			sum += Integer.parseInt(temp);
		}
	}
	return sum;
	}
	
	
	public static void main(String[] args) {
		
	System.out.println(sumDigits("aa11b33"));	
	}
}
