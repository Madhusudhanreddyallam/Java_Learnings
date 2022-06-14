package a_String;

public class rev_word {
	
	public static void main(String[] args)
	{
		reverse_word_fn();
		String nm = "Madhu Sudhan Reddy";
		String a[] = nm.split(" ");
		
		for(int i=a.length-1 ; i>=0 ; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void reverse_word_fn()
	{
		String nm = "Madhu Sudhan Reddy";
		String[] arr = nm.split(" ");
		
		String final_nm = "";
		for(String a : arr)
		{			
			for(int i=a.length()-1 ; i>=0 ; i--)
			{
				final_nm += a.charAt(i);
			}
			
			final_nm += " ";
		}
		
		System.out.println(final_nm.trim());
	}

}
