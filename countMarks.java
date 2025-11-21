import java.util.Scanner;
public class countMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        char arrc[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            arrc[i] = sc.next().charAt(i);  
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" "+arrc[i]);
        }
    //     int countp =0;
    //     int countf =0;
    //     for(int i =0;i<n;i++){
    //     if(arr[i]>75){
    //         countp++;
    //     }
    //     else if(arr[i]<50){
    //         countf++;
    //     }

    //    }
    //    System.out.println("fail"+countf);
    //    System.out.println("pass"+countp);


    }
}
