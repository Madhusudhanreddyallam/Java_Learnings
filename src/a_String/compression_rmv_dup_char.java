package a_String;

public class compression_rmv_dup_char {
	
	public static void main(String[] args)
	{
		String str = "AAABBBBCC";    
		String temp = "";
		
		int i=0;
		while(i<str.length())
		{
			if(temp.indexOf(str.charAt(i))== -1)
				temp += str.charAt(i);
			i++;
		}
		System.out.println(temp);
	}

}
