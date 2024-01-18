package z_Parc;

import java.util.HashMap;

public class DivisiblePairsCount {

    public static int countPairsDivisibleBy60(int[] nums) {
        int count = 0;
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
     for(int value : nums)
     {   
    	int remainder =  value % 60;
        int reqvalue = 60- remainder;
        count += hm.getOrDefault(reqvalue, 0);
        hm.put(remainder, hm.getOrDefault(remainder, 0)+1);
     }

        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {30, 20, 150, 100, 40, 90};
        int result = countPairsDivisibleBy60(numbers);
        System.out.println("Count of pairs divisible by 60: " + result);
    }
}

	


