package C_array_programs;

public class missing_num {
// this solution works only we have numbers starts from 1 and in sequence(1, 2 , 4,5),(1,2,3) or only 1 is missing in sequence (2,5,4,3)
	public static int miss_num(int[] a)
	{
		int n = a.length+1; //we are adding 1 considering that one number is missing in the lenght
		int min = n * (n+1)/2;
		System.out.println(min);
		int sum = 0;
		for(int i=0 ; i<a.length ; i++)
		{
			sum += a[i];
		}		
		
		return min-sum;
	} 
	
	public static void main(String[] args)
	{
		int num[] = {4,2,3,5}; 
		int missing = miss_num(num);
		System.out.println(missing);
	}

}
