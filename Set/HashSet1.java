
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<>();
        int n = 5;
        Scanner sc = new Scanner(System.in);
        // Insertion in hashset
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            myset.add(num);
        }
        System.out.println(myset);

        // iteration using iterator

        Iterator<Integer> it = myset.iterator();
        // while (it.hasNext()) {
        //     Integer num = it.next();
        //     System.out.println(num);
        // }

                // usigng for loop

        // for (Integer i:myset) 
        // {
        //    System.out.println(i);    
        // }

              // to remove element

        while (it.hasNext()) {
            Integer num = it.next();
            if (num == 5) {
                it.remove(); // Use iterator's remove method
            }
        }
        System.out.println(myset);
    }
}
