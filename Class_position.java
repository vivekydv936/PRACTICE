import java.util.Scanner;
import java.util.ArrayList;

public class Class_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1=5;
        int marks[]={80,80,97,80,90,90,56};
        // int A1[] =new int[n1];
        
        // for(int i=0;i<n1;i++){
        //     A1[i]=sc.nextInt();
        // }
        ArrayList<Integer> posn=new ArrayList<>();
        int max=0;
        int position=0;
        int len=marks.length;

        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(marks[i]<marks[j]){
                        count++;
                }

            }
            posn.add(count+1);
        }
        
        System.out.println(posn);


    }
    
}
