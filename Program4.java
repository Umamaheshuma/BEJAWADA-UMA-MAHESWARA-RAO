import java.util.*;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        Map<Integer, Integer> counts = new LinkedHashMap<>();

        // Initialize dictionary keys 1 to 9 with value 0
        for(int i = 1; i <= 9; i++) {
            counts.put(i, 0);
        }

        // Check divisible count for each number
        for(int num : arr) {
            for(int key = 1; key <= 9; key++) {
                if(num % key == 0) {
                    counts.put(key, counts.get(key) + 1);
                }
            }
        }

        // Print output
        System.out.println(counts);
    }
}
