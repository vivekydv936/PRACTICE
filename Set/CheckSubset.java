
import java.util.*;
public class CheckSubset {
    public static void main(String[] args) {
         Set<Integer> myset = new HashSet<>();
         Set<Integer> myset2 = new HashSet<>();
        int n1 = 2;
        Scanner sc = new Scanner(System.in);
        // Insertion in hashset
        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            myset.add(num);
        }
        System.out.println(myset);

        int n2=5;
        for (int i = 0; i < n2; i++) {
            int num = sc.nextInt();
            myset2.add(num);
        }
        System.out.println(myset2);


                boolean mark =true;
        Iterator<Integer> it =myset.iterator();
        while (it.hasNext()) {
            int num =it.next();
            if(!myset2.contains(num)){
                mark=false;
                    
            }
            
        }
        if(mark){
            System.out.println("is subset");
        }
        else{
            System.out.println(" subset");
        }
        

    }
}
