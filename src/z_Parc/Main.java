package z_Parc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample HashMap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 3);
        map.put(3, 7);
        map.put(4, 2);
        map.put(5, 5);

        // Threshold value
        int threshold = 1;

        // Count of keys where the value is greater than the threshold using streams
        long count = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > threshold)
                .count();

        System.out.println("Count of keys where the value is greater than " + threshold + ": " + count);
    }
}




