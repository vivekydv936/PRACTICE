// public class binarysearch {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         int item = 5;
//         int low = 0;
//         int high = arr.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == item) {
//                 System.out.println("found at index: " + mid);
//                 return;
//             } else if (arr[mid] < item) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println("not found");
//     }
// }
 public class binarysearch {

    public static int binaryrec(int arr[],int item,int strt,int end){
       int mid =strt+(end-strt)/2;
       if(strt>end){
        return -1;
       }
       if(arr[mid]==item){
        return mid;
       }
       if(arr[mid]<item){
        return binaryrec(arr, item, mid+1, end);
       }
       return binaryrec(arr, item, strt, mid-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int item =5;
        int strt =0;
        int end = arr.length-1;

        int result = binaryrec(arr, item, strt, end);
        if(result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index: " + result);
        }

    }
 }
