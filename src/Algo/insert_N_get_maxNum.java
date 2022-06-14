package Algo;

public class insert_N_get_maxNum {
	
	public static void main(String args[])
	{
		int N = 903, K = 5 , rem , max_num = 0;
		
		while(N!=0)
		{
			rem = N % 10;
			if(rem > K)
			{
				max_num = max_num * 10 + rem;
				N=N/10;
			}
			else
			{
				max_num = Integer.parseInt(String.valueOf(max_num)+String.valueOf(K)+String.valueOf(N));
				break;
			}
				
		}
		
		System.out.println(max_num);
	}

}
