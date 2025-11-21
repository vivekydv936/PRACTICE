import java.util.ArrayList;
import java.util.Scanner;

public class listsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] = new int[5];
        int n = arr.length;
        for(int i =0;i<n;i++){
          arr[i] =sc.nextInt();
        }
//         ArrayList<Integer> arr= new ArrayList<>();
//         arr.add(5);
//         arr.add(10);
//         arr.add(0);
//         arr.add(8);
//         arr.add(3);

//         int n =arr.size();
//  int sum1 =0;
//  int sum2 =0;
//         for(int i=0;i<n;i++){
//             if(arr.get(i)%2==0){
//                 sum1 ++;
//             }
//             else {
//                 sum2 ++;

//             }
//         }

        // for(int i=0;i<n;i=i+2){

        //   sum1 += arr.get(i);
        // }
        // for(int i=1;i<n;i=i+2){

        //   sum2 += arr.get(i);
        // }
        // System.out.println(sum1 +" " +sum2 );
        // if(sum1==sum2){ System.out.println("tie");}
        // if(sum1>sum2){ System.out.println("even");}
        // if(sum1<sum2){ System.out.println("odd");}


        // int arr[] = {5, 10, 0, 8, 1, 3,3};
        
        int esum =0;
        int osum =0;
        for(int i =0;i<n ;i++){
            if(arr[i]%2==0){
                esum++;
            }
            else{
                osum++;
            }
        }
        if(esum==osum){
            System.out.println("tie");
        }
        else if(esum>osum){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
