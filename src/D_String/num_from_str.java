package D_String;

public class num_from_str {
	
	public static void main(String[] args)
	{
		m1();System.out.println();
		m2();System.out.println();
		m3();
		m4();
	}
	
	public static void m1()
	{
        String str = "m123a7655";	
		for(int i=0; i<str.length(); i++)		
		{
			if(str.charAt(i)>= '0' && str.charAt(i)<= '9')
			{
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void m2()
	{
        String str = "m123a7655";
		System.out.print(str.replaceAll("[^0-9]", ""));
		
	}
	
	public static void m3()
	{
        String str = "m123a7655";
        //char c[] = str.toCharArray();
        String st = "";
		for (char a : str.toCharArray())
			{
				if (a>='0' && a<='9')
				{
					st +=a;					
				}
				
			}System.out.print(st);
		
	}
	
	public static void m4 ()
	  { 
		  String str = "m123a$7655";
		  for(char c : str.toCharArray())
		  {
			  if(Character.isLetterOrDigit(c))
			  {
				  System.out.print(c);
			  }
		  }
	  }
}
