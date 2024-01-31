package z_Parc;

public class DivisiblePairsCount {

	public static void main(String[] args) {
		
		int i = 0	;
		int num = i*i; //81

	    int rem = 0;
	    
	    while(num != 0) {
	    	rem += num%10; //8
	    	num = num/10; // 0
	    }
	    
	    if(rem == i)
	    	System.out.println("true");
	    else
	    	System.out.println("Not a neon number");

	}
}




