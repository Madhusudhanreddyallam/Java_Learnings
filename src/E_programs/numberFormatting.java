package E_programs;

public class numberFormatting {
	public static void main(String[] args) {
		long number = 10000000000L;

		String formattedNumber = formatNumberWithSeparator(number);

		System.out.println(formattedNumber);
	}

	private static String formatNumberWithSeparator(long number) {
		if (number < 1000) {
			return String.valueOf(number);
		} else {
			StringBuilder sb = new StringBuilder();
			String numberStr = String.valueOf(number);
			int length = numberStr.length();System.out.println(length);

			for (int i = 0; i < length; i++) {
				sb.append(numberStr.charAt(i));
				if ((length - i - 1) % 3 == 0 && i < length - 1) {
					sb.append("'");
				}
			}

			return sb.toString();
		}
	}

}
