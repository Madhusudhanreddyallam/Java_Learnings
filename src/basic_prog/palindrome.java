package basic_prog;

public class palindrome {

	public static void main(String[] args) {
		
//    m1(101);	
    reversenum(101101);

	}
	
	public static void m1(int val)
	{
		//int a = 101;
		String s = String.valueOf(val);
		String rev = "";
		
		for(int i=s.length()-1 ; i>=0 ; i--)
		{
			rev += s.charAt(i);
		} //System.out.println(rev);
		
		if(s.equals(rev))
        	System.out.println("Given number is palindrome " + val);
        else
        	System.out.println("Given number is NOT a palindrome " + val);
	}
	
	public static void reversenum(int palcheck)
	{
		int num = palcheck , rev = 0 , rem =0;
		
		while(num != 0)
		{
			rem = num % 10 ; 
			rev = rev*10 + rem;
			num = num/10;
		} 

        if(palcheck == rev)
        	System.out.println("Given number is palindrome " + palcheck);
        else
        	System.out.println("Given number is NOT a palindrome " + palcheck);
		
	}

}
