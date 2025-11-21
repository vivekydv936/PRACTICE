import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListOfArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mylist =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
         int nrow =sc.nextInt();
         int mcol =sc.nextInt();
         for(int i=0;i<nrow;i++){
            mylist.add(new ArrayList<>());
            for(int j=0;j<mcol;j++){
                mylist.get(i).add(sc.nextInt());
            }
         }


         for(int i=0;i<nrow;i++){
            int max=Integer.MIN_VALUE;
            int sum=0;
            int min=Integer.MAX_VALUE;
             for(int j=0;j<mcol;j++){
                //  System.out.print(mylist.get(i).get(j) + " ");
                    // if(mylist.get(i).get(j)>max){
                    //     max=mylist.get(i).get(j);
                    // }
                    max = Math.max(max, mylist.get(i).get(j));
                    min = Math.min(min, mylist.get(i).get(j));
                    // if(mylist.get(i).get(j)<min){
                    //     min=mylist.get(i).get(j);
                    // }
                    sum += mylist.get(i).get(j);
                    
             }
             System.out.print(sum+" "+min+" "+max);
             
             
             System.out.println();
         }

    }
}
