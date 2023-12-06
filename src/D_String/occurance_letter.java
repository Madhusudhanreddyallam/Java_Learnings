package D_String;

public class occurance_letter {
	
	public static void main(String[] args)
	{
		m2();
	}

	 public static void m1()
	 {
		 String str = "Madhu Sudhan";
			int i = 0;
			for (char ch: str.toCharArray())
			{
				if(ch == 'a')
					i++;
			}
			System.out.println("Alphabet a is repeated = " + i);
	 }
	 
	 public static void m2(){
		 String str = "Madhu Sudhan";
		 int count = 0;
		 for(int i = 0 ; i< str.length() ; i++)
		 {
			 if(str.charAt(i) == 'a')
				 count++;
		 }System.out.println("Alphabet a is repeated = " + count);
	 }
}
