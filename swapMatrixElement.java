import java.util.ArrayList;
import java.util.*;

public class swapMatrixElement {
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

        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.get(i).size()-1; j++) {
                // System.out.print(arr.get(i).get(j) + " ");
                int temp =arr.get(i).get(j);
                arr.get(i).set(j,arr.get(i+1).get(j+1));
                arr.get(i+1).set(j,temp);
                

            }
            System.out.println();
        }

         for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                 System.out.print(arr.get(i).get(j) + " ");
            }
            System.err.println();
        }


}
}
