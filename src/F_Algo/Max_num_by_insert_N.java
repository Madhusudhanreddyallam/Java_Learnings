package F_Algo;

public class Max_num_by_insert_N {


	public static int maximizeNumber(int N, int K)
	{
		String value = String.valueOf(N);
		String temp = "";
		int i=0;
		
		while(i<value.length() && Character.getNumericValue(value.charAt(i))>= K)
		{
				temp += value.charAt(i);
				i++;
		}
		
		temp+= String.valueOf(K);

		         
		while(i<value.length())
		{
			temp+=value.charAt(i);
			i++;
		}
		
		return Integer.parseInt(temp);
	}


		public static void main (String args[]) {
			int N = 0, K = 5;
			System.out.println(maximizeNumber(N, K));
		}

	}




