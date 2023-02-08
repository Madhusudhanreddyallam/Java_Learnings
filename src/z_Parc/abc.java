package z_Parc;


//Java program for the above approach

public class abc {


	public static void maximizeNumber(int N, int K)
	{
		
	}


	public static void main (String args[]) 
	{
		int N = 6673, K = 6;
		String num = Integer.toString(N);
		String result = "" ;
		//maximizeNumber(N, K);
		
		for (int i=0 ; i<num.length();i++)
		{
			if(((int)num.charAt(i) - (int)'0')<K)
			{
				break;
			}
			else
			{
				result += num.charAt(i);
			}
		} System.out.println(result);
	}

}


