package D_String;

public class ZeroToFront {
	
	public static void main(String[] args) {
		String s = "30420500";
		String result = moveZerosToFront(s);
		System.out.println(result);
	}

	public static String moveZerosToFront(String s) {
		StringBuilder sb = new StringBuilder();	
		for(char c : s.toCharArray()) {
			if(c=='0') {
				sb.insert(0,c);
			}
			else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
