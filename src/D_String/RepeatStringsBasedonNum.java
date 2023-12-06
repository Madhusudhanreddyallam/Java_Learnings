package D_String;

public class RepeatStringsBasedonNum {
	
	 public static void main(String[] args) {
	        String input = "ab2$cd3";
	        String output = duplicateCharacters(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    private static String duplicateCharacters(String input) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            if (!Character.isDigit(currentChar)) {
	                result.append(currentChar);
	            } else {
	                char previousChar = input.charAt(i - 1);
	                int repeatCount = Character.getNumericValue(currentChar);

	                for (int j = 1; j < repeatCount; j++) {
	                    result.append(previousChar);
	                }

	            }
	        }

	        return result.toString();
	    }

}
