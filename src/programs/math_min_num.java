package programs;


public class math_min_num {
	
	public static void main(String args[])
	{
		
		System.out.println(Double.MIN_VALUE);System.out.println(Float.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0));
		System.out.println(Math.min(Double.MIN_VALUE, Long.MIN_VALUE));
		System.out.println(Math.min(Double.MIN_VALUE, Float.MIN_VALUE));
	}

}
