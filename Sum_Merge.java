import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sum_Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =5;
        int n2=5;
        int A1[] =new int[n1];
        int A2[] =new int[n1];


        for(int i=0;i<n1;i++){
            A1[i]=sc.nextInt();
        }
        System.out.println("arrray 2");
        for(int i=0;i<n2;i++){
            A2[i]=sc.nextInt();
        }
        

       

        ArrayList<Integer> list=new ArrayList<>();
         for (int v : A1) list.add(v);
        for (int v : A2) list.add(v);

       
        Collections.sort(list);
       int size= list.size();
       int mid= size/2;
        System.out.println(list);
       System.out.println(list.get(mid-1));
       System.out.println(list.get(mid));
       

    }
}
