package E_programs;

public class count_no_of_obj {
	
	  static int count;
	
	{
		count +=1;
		
	}
	
	public static void main(String[] args)
	{
		count_no_of_obj obj = new count_no_of_obj();
		count_no_of_obj obj1 = new count_no_of_obj();
		count_no_of_obj obj2 = new count_no_of_obj();
		count_no_of_obj obj3 = new count_no_of_obj();
		System.out.println(obj3.count);
	}

}
