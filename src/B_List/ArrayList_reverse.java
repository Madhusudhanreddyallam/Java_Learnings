package B_List;


import java.util.*;


public class ArrayList_reverse {
	
	public static void main(String[] args) {
		List<String> arL = new ArrayList<String>();
		arL.add("Madhu");
		arL.add("Niharika");
		arL.add("Suma");
		arL.add("Aslan");
		arL.add("Dhiraj");
		
		for(int i=arL.size()-1 ; i>=0 ; i--) {
			System.out.println(arL.get(i));
		}
		
		//OR use default method
		Collections.reverse(arL);
	}
}
