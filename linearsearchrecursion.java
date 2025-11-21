import java.util.*;
public class linearsearchrecursion {

    public static int linearsearch( int arr[],int item,int index){
        if(index>=arr.length){
            return -1;

        }
        if (arr[index]==item){
            return index;

        }
        else {
            return linearsearch(arr, item, index+1);
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc =new Scanner(System.in);

        int item =sc.nextInt();
        int index =0;
       int result = linearsearch(arr, item, index);
       if(result==-1){
        System.out.println("not found");
       }
       else{
        System.out.println("found at index: " + result);
       }
    }
}
