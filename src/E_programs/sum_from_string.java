package E_programs;

public class sum_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "jklmn489pjro635ops";
		 int sum = 0;
		 int evenSum = 0;
		 
		 for (char c : a.replaceAll("\\D", "").toCharArray()) {
		     int digit = c - '0';
		     sum += digit;
		     if (digit % 2 == 0) {
		         evenSum += digit;
		     }
		 }
		 System.out.println(sum);
		 System.out.println(evenSum);

	}

}
