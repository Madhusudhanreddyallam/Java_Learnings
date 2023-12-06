package E_programs;

public class static_final {

	public static void main(String[] args) {
	
		System.out.println(main.X);

	}

}

class main
{
	// if a final keyword is given in the below statement output will only print 10 , else it wil print 10 & abc
	public static final int X = 10;
	
	static
	{
		System.out.println("abc");
	}
}
