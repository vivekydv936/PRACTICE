
import java.util.*;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};
            Arrays.sort(arr);
        // Sort in descending order
        // Arrays.sort(arr, Collections.reverseOrder());
            
        System.out.println(Arrays.toString(arr));
    }
}
