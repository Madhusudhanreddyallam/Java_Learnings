package array_programs;

public class missing_num {
	
	public static int miss_num(int[] a)
	{
		int n = a.length+1;
		int min = n * (n+1)/2;
		
		int sum = 0;
		for(int i=0 ; i<a.length ; i++)
		{
			sum += a[i];
		}		
		
		return min-sum;
	} 
	
	public static void main(String[] args)
	{
		int num[] = {1,2,3,5,4};
		int missing = miss_num(num);
		System.out.println(missing);
	}

}
