package F_Algo;

import java.util.HashMap;
import java.util.Map;

public class OracleSongCombination {
	public static int findCombinationsCount(int[] durations) {
        Map<Integer, Integer> durationCount = new HashMap<>();
        int count = 0;

        for (int duration : durations) {
        	int reminder = (duration % 60);
            int complement = (60 - reminder) % 60;
            count += durationCount.getOrDefault(complement, 0);
            durationCount.put(reminder, durationCount.getOrDefault(reminder, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] songDurations = {30, 20, 150, 100, 40 , 90};
        int result = findCombinationsCount(songDurations);
        System.out.println("Number of song combinations with durations divisible by 60: " + result);
    }

}
