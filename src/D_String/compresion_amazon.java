package D_String;

public class compresion_amazon {

	public static void main(String[] args) {
		String str = "AB"; // input
		String compressedString = compressString(str);
		System.out.println(compressedString); // A3B5C1
	}

	public static String compressString(String input) {
		if (input == null || input.isEmpty() || input.length()==1) {
			if(input.length()==1) {
				return input+1;
			}
			return input;
		}

		StringBuilder compressed = new StringBuilder();
		char currentChar = input.charAt(0);
		int count = 1;

		for(int i=1; i<input.length();i++) {
			if(input.charAt(i) == currentChar) {
				count++;
			}else {
				compressed.append(currentChar+""+count);
				currentChar = input.charAt(i);
				count =1;
			}
		} 
		compressed.append(currentChar+""+count);

		return compressed.toString();

	}
}
