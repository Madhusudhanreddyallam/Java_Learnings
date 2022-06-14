package array_programs;

public class char_compression_amz {

	public static int compress(char[] chars) {

		String temp = "";

		int count = 1;
		for(int i=0 ; i<chars.length ; i++)
		{
			if(i == chars.length-1)
			{
				if(chars[i] == '1')
					temp += chars[i];
				else
					temp += chars[i]+""+count;
				break;
			}
			if(chars[i]==chars[i+1])
			{
				count++;
			}
			else
			{
				if(chars[i] == '1')
				{
					temp += chars[i];
					count = 1;
				}
				else
				{
					temp += chars[i]+""+count;
					count = 1;
				}
			}
		}
		//System.out.println(temp);
		char[] input = new char[temp.length()] ;
		for(int i=0; i<temp.length() ; i++)
		{
			input[i] = temp.charAt(i);
		}
		chars = input.clone();
		System.out.println(chars);

		return temp.length();
	}
	public static void main(String[] args)
	{
		char[] a = {'a','a','b','b','c','c','c'};
		compress(a);
	}

}
