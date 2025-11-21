
import java.util.*;
public class MutualCommon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 =5;
        int n2 =6;
        int a1 [] = new int[n1];
        int a2 [] = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] =sc.nextInt();
        }
        System.out.println("second");
        for (int i = 0; i < n2; i++) {
            a2[i] =sc.nextInt();
        }

        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();
        for( Integer i: a1){
            set1.add(i);
        }
        for( Integer i: a2){
            set1.add(i);

        }

        Set<Integer> temp =new HashSet<>();
        temp =set1;
        // Set<Integer> q =new HashSet<>();
         temp.remove(set2);
         int r =temp.size();
         temp.clear();
         temp =set2;
         temp.remove(set1);
         int m =temp.size();

         System.out.println(r*m);




        
            

    }
}
