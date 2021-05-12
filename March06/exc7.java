package PadmaGandla;

public class exc7 {

static int countYZ(String str) {

  int len = str.length();

  int count = 0;

  str = str.toLowerCase();

   

  for (int i = 0; i < len; i++) {

     
    if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {

      if (i < len-1 && !Character.isLetter(str.charAt(i+1)))

        count++;

      else if (i == len-1)

        count++;

    }

  }

  return count;

}
	
	public static void main(String[] args) {
		
		System.out.println(countYZ("fez day"));
		
		
		
	}

}
