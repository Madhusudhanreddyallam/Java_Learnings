package oops2;

public class check {

	
	public  boolean a() {
		int a=3;
		if(a==3)
		{
			System.out.println("in if block");
			return true;
		}
		
		System.out.println("madhu");
		return false;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public_constructor.getinstance().madhu();
		check c = new check();
		c.a();

	}

}
