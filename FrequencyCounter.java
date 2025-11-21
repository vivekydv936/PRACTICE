import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {10, 5,5, 10, 15, 10, 5};

        // Step 1: Create an empty map
        Map<Integer, Integer> map = new HashMap<>();

        // Step 2: Loop through the array
        for (int num : arr) {
            // If the number is already in the map, increase its count by 1
            // if (map.containsKey(num)) {
            //     map.put(num, map.get(num) + 1);
            // }
            // // If the number is not in the map, put it with count 1
            // else {
            //     map.put(num, 1);
            // }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Print each number and its frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
