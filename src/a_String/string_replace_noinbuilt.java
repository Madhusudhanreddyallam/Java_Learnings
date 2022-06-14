package a_String;

public class string_replace_noinbuilt {

	  /*public static void main(String[] args)
	  {
		  String s1 = "Hyderabad";
		  String s2 = "bad";
		  String s3 = "xyz";
		  
		  int i = 0 ; String last = "";
		  
		  if(s1.contains(s2))
			  i = s1.indexOf(s2);
		  
		 for(int j=0;j<i;j++)
		 {
			 last += s1.charAt(j);
		 }
		 
		 last = last+s3;
		 
		 System.out.println(last);
	  } */
	  
	  public static void main(String[] args)
	  {
		  String s1 = "Hyderabad";
		  String s2 = "bad";
		  String s3 = "xyz";
		  
		  String temp = "";
		 for(char j : s1.toCharArray())
		 {
			 if(j=='b')
			     break;
			 else
				 temp += j; 
		 }
		 
		 temp = temp+s3;
		 
		 System.out.println(temp);
	  }
}
