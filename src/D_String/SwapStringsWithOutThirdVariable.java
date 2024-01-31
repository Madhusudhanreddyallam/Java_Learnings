package D_String;

public class SwapStringsWithOutThirdVariable {
	
	public static void main(String[] args) {

		String s = "Madhu";
		String s2 = "Sumaa";

		s = s+s2; 
		s2= s.substring(0,s.length()-s2.length()); //Madhu
		s = s.substring(s2.length()); //suma
		System.out.println(s2 + " " + s);
	}

}
