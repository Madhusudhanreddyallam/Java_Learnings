package array_programs;

public class Find_2_high_num {

	public static void main (String args[])
	{
		int[] arrayvalue = { 1,1};
		largvalue2(arrayvalue );		
	}
	
	    public static void largvalue2 (int num[])		
	    {
								
            int i , first , second;           
            if (num.length < 2)
            {
            	System.out.println("Invalid input");
            	return;
            }
            	            
            first = second = Integer.MIN_VALUE;           
            for (i=0 ; i< num.length ; i++)          	
            {
            	if (num[i]>first)
            	{
            		second = first;
            		first = num[i];
            	}
            	
            	else if (num[i]>second && num[i] != first )
            	{
            		second = num[i];
            	}
            }
            
            if (second == Integer.MIN_VALUE )
                 System.out.println("given nos are same hence there is no second higest no");
            else
            	System.out.println("second value in the array is " + second);
            }  
	
	}



