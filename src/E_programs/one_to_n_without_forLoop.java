package E_programs;

public class one_to_n_without_forLoop {

	
	// Prints numbers from 1 to n
    static void printNos(int n)
    {
        if(n <= 100)
        {   
        	System.out.print(n + " ");
        	printNos(n + 1);      
            
        }
       
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        printNos(1);
    }
}
 

