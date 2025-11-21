import java.util.ArrayList;
import java.util.Scanner;
public class SwapTheNUmbers {
        public static void main(String[] args) {
            
            Scanner sc =new Scanner(System.in);
            int k=2;
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

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                // System.out.print(arr.get(i).get(j) + " ");

                

            }
            System.out.println();
        }




        }
}

