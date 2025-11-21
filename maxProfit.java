import java.util.Scanner;

public class maxProfit {
    public static void main(String[] args) {
       // Scanner sc= new Scanner(System.in);
        int n =5;
        int p []={1,5,2,3,1};
        int maxp =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                
                    maxp=Math.max(maxp,p[j]-p[i]);
                
            }
        }
        System.out.println(maxp);




        
    }
}
