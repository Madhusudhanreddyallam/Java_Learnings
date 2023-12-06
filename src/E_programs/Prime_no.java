package E_programs;

public class Prime_no {
	
	public boolean prime_check(int value) {
		
		boolean isprime = true;
			
			if(value <= 1) 	
			{
				isprime = false;
			}
			
			else 
			{
			   for (int i = 2; i <= value / 2; i++) {
	           int remainder = value % i ;
	                if (remainder == 0) 
	                 {
	            	   isprime = false;
	            	   break;
	                }
	            }
			
		}
			return isprime;					
				
	}
	
	public static void main(String args[])
	{
        int min = 0;
        int max = 100;
		Prime_no p = new Prime_no();
		
		for (int i = min ; i<=max ; i++) 
		{
			if (p.prime_check(i))
			  System.out.print(i + " " );
		}
		
	}

}
