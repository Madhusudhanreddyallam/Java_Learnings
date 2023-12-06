package F_Algo;

public class insert_N_get_maxNum {


	public static void main (String args[]) 
	{
		int N = 6673, K = 6;
		maximizeNumber(N, K);
	}

	public static void maximizeNumber(int N, int K)
	{

		String s = Integer.toString(N);
		int L = s.length();


		String result = "";
		int i = 0;


		while ((i < L) && (K <= ((int)s.charAt(i) - (int)'0'))) 
		{
			result += (s.charAt(i));
			++i;
		}

		result += ((char)(K + (int)'0'));

		while (i < L) 
		{
			result += (s.charAt(i));
			++i;
		}

		System.out.println(result);
	}


}
