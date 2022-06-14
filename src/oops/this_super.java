package oops;

public class this_super {
	
	int a = 0;
	
	public void main () {
		
		System.out.println(a);
	}

}

class B extends this_super {
	
	int b = 1;
	
	public void main2()
	{
		System.out.println(b);
     		
	}
}

class C extends B
{
	public  void main (String[] args)
	{
		super.main();
		super.main2();
		System.out.println(super.a);
		System.out.println(super.b);
	}
}