package a_String;

public class string_immutable {
	
	public static void main(String[] args)
	{
		equals() ;
		impmethod();
	    
	}
	
	public static void equals() 
	{
		String s = new String("Madhu");
		String s1 = new String("madhu");
		String s2 = s1.toLowerCase();
		String s3 = "Madhu";
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}
	
	public static void impmethod()
	{
		String s = "";
		String s1 = "MadhuM";
		System.out.println(s.isEmpty() + " "+ s1.length());		
		System.out.println(s1.replace("M", "A"));
		System.out.println(s1);
		System.out.println("SubString " + s1.substring(1));
		System.out.println("SubString " + s1.substring(0 , s1.length()));
		System.out.println("index " + s1.indexOf('M'));
		System.out.println("last index " + s1.lastIndexOf("M"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
	

}
