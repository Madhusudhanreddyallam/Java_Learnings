package D_String;

public class rev_letter {
	
	//Pick for product based
	public static String reverseString(String input) {
		StringBuilder sb = new StringBuilder();
		for(int i= input.length()-1 ;i >=0;i--)
		{
			sb.append(input.charAt(i));
		} 
		return sb.toString();
	}
	
	public static void main (String[] args)
	{
		
		String name = "Madhu";
		String temp = "";
		
		
		//using custom method2
		for(int i=0;i<name.length();i++)
		  {
			  temp = name.charAt(i) + temp;
		  } System.out.println(temp);
		
			//using custom method
			for(int i=name.length()-1 ; i>=0 ;i--)
			{
				temp += name.charAt(i);
			}
			System.out.println(temp);
			
		//using built in methods
		StringBuilder S = new StringBuilder(name);
		System.out.println(S.reverse());//S.reverse();
		
		//using built in methods
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());//S.reverse();
	}

}
