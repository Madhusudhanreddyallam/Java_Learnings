package oops;

public class Access_modifer2 {
	
	public static void main (String args[])
	{
		Access_modifer1 a = new Access_modifer1();
		System.out.println(a.Public);
		System.out.println(a.Protected);
		System.out.println(a.Default);
		a.default_method();
		a.protected_method();
		a.public_method();
		
	}

}
