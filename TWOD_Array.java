import java.util.ArrayList;
import java.util.Scanner;
public class TWOD_Array {
        public static void main(String[] args) {
            
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(new ArrayList<>());
                for(int j=0;j<m;j++){
                        arr.get(i).add(sc.nextInt());
                    }
            }
            // for(int i=0;i<n;i++){
            //         for(int j=0;j<m;j++){
            //             arr.get(i).add(sc.nextInt());
            //         }
            // }

             System.out.println("Dynamic 2D Array:");

        for (int i = 1; i < arr.size()-2; i++) {
            for (int j = 1; j < arr.get(i).size()-2; j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }




        }
}
