package array_programs;

public class multiple_miss_num {
	
	public static void main(String[] args)
	{
		//int[] all ;
		int[] miss = { 3,4 };
		
		for (int i=1 ; i<=5 ; i++)
		{
			int count = 0;
			for (int j=0 ; j<miss.length ; j++)
			{
				if(i==miss[j])
					count++;
			}
			if (count == 0)
				System.out.println(i);
		}
	}

}
