package z_Parc;

public class practi extends abc{
	
	int i;

	public  void mad ()
	{
		this.i = 10;
		
		System.out.println(super.i = 100);
	}
	
	public static void main(String args[])
	{
		practi obj = new practi();
		obj.mad();
	}
}
