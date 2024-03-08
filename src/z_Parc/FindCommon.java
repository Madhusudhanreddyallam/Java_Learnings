package z_Parc;


public class FindCommon {
	
	static int a = 2;
	
	
	public void mult() {
		a= a*2;
		System.out.println(a);
	}
	
	public  static void main(String[] args) {
		FindCommon FindCommon = new FindCommon();
		FindCommon.mult();
		FindCommon FindCommon2 = new FindCommon();
		FindCommon2.mult();
	}
	
}
	