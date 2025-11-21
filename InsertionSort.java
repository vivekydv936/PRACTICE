public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={2,4,5,7,89,23,4};
        int n = arr.length;
        insertion(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion(int arr[],int n) {
        for(int i=0;i<n;i++){
            int j =i-1;
            int key = arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
