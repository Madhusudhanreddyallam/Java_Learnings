package programs;

public class sortanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value[] = { 6, 4 ,8, 1 , 5};
		int temp = 0;
		
		for(int i=0 ; i<value.length ; i++)
		{
			for (int j=i+1 ; j<value.length; j++)
			{
				if(value[i]>value[j])
				{
					temp = value[i];
					value[i] = value[j];
					value[j] = temp;
				
				}
			}
			
		}
		   
        
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int n = 0; n < value.length; n++) {     
            System.out.print(value[n] + " ");    
        }   
        

	}

}
