import java.util.*;
import java.util.ArrayList;

public class groupWise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("group");
        int group =sc.nextInt();
        for(int i =1;i<=group;i++){
            System.out.println("size");
             int n = sc.nextInt();
                //  int arr[] = new int[n];
                ArrayList<Integer> arr = new ArrayList<Integer>();
                
                 for(int j=0;j<n;j++){
                    arr.add(sc.nextInt());
                 }
                 int sum =0;
                 for(int j =0;j<n;j++){
                    sum += arr.get(j);
                 }
                 System.out.println("Group " + i + " average: " + (sum / n));
                 int min =0;
                for(int j=0;j<n;j++){
                   if(arr.get(j)<arr.get(min))     {min=j;}
                }
                System.out.println("Group " + i + " minimum: " + arr.get(min));

                 int max =0;
                 for(int j =0;j<n;j++)
                 {if(arr.get(j)>arr.get(max))     {max=j;} }
                 System.out.println("Group " + i + " maximum: " + arr.get(max));

        }

    }
}
