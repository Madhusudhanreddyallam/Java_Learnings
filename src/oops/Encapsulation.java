package oops;

 class datahiding  {

	private	int balance = 100;
	
	public int getA(String Username , String password) 
	{		
		if (Username == "madhu"  && password =="reddy")
			return balance;
		
		else
			return 0;		
	}

	public void setA(int acc_no , String ifsc_code , int deposit_amount) 
	{		
		if (acc_no == 123 && ifsc_code == "HDFC")
		   this.balance = this.balance + deposit_amount; 
		else
			this.balance = this.balance;
	}

}

 public class Encapsulation 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		datahiding en = new datahiding();
		en.setA(123,"HDFC",500);		
		System.out.println(en.getA("madhu" , "reddy"));

	}

}
