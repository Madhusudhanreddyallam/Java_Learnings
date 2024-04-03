package z_Parc;



public class Main {
	public static void main(String[] args) {
		String word = "";
		System.out.println(countRepChar(word));
	}

	public static String countRepChar(String word) {
		if( word == null || word.isBlank() ) {
	        throw new IllegalArgumentException("Provide a non-null and non-blank word");
		}

		StringBuilder sb = new StringBuilder();
		char prevChar = word.charAt(0);	
		int count = 1;
		for(int i=1 ; i< word.length() ; i++ ) {
			char currentChar = word.charAt(i);
			if(prevChar == currentChar) {
				count++;
			}
			else {
				sb.append(prevChar).append(count);
				count=1;
				prevChar = currentChar;
			}
		} 
		sb.append(prevChar+""+count); 
		return sb.toString();
	}
}




