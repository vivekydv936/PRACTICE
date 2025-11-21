import java.util.*;

public class Unique_nUmbers {
    public static void main(String[] args) {
        Set<Integer> myset =new TreeSet<>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        //  inputting array
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
            //   adding to set
            for(Integer i: arr){
                myset.add(i);
            }

            System.out.println(myset);
    }
}
