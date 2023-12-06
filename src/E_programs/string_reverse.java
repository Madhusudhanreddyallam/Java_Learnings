package E_programs;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "madhu";
		String rev = "";
		
		//with out built in method
		for (int i=name.length()-1; i>=0 ;i--)
		{
			rev += name.charAt(i);
		}
   System.out.println(rev);
   
   //with built in method
   StringBuffer sf = new StringBuffer (name);
  System.out.println(sf.reverse()); 
	}

	  
	  
}
