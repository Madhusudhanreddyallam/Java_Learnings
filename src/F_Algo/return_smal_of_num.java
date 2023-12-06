package F_Algo;

public class return_smal_of_num {
	
	 public static int solution(int N) {
	        
	        int i = 1;
	        while(1!=0)
	        {
	            if(getSum(i)==N)
	            {
	               return i;
	            }
	            i++;
	        }
	        
	    }

	    static int getSum(int n)
	        {
	            int sum = 0;
	            while(n!=0)
	            {
	              sum = sum + n%10;
	              n= n/10;
	            }
	            return sum;
	        }
	    
	    public static void main (String[] args)
	    {
	    	int i = 19;
	    	int sum = solution(i);
	    	System.out.println(sum);
	    }

}
