import java.util.Arrays;
class longestSubarray {
    public static void main(String[] args) {
        int [] nums={0,0,4,5,2,6,3}; // WORKS ONLY FOR ZEROS AND POSITIVE NO (NOT FOR NEGATIVE NO)
        int k = 3;
        int left =0;
        int right =0;
        int maxLength = 0;
        int sum = nums[0];
        int n= nums.length;
        while(right<n){
            if(right<n) {
                sum += nums[right];
                
            }
            while(sum>k && left<right){
                sum -= nums[left];
                left++;
            }
            if(sum==k ){
                
           System.out.println();
                maxLength = Math.max(maxLength,right-left+1);
            }
           
            right++;
        }
         System.out.println(maxLength);
    }
}

// public class longestSubarray {

//     public static void main(String[] args) {
//         int[] nums={-1,0,0,4,5,6,1,2};
//         int k =3;
//         int maxlength =0;
//         int n =nums.length;
//         for(int i =0;i<n;i++){
//             int sum =0;
//             for(int j =i;j<n;j++){
//                 sum += nums[j];
//                 if(sum == k){
//                     maxlength = Math.max(maxlength, j - i + 1);
//                 } 
//             }
//         }
//         System.out.println(maxlength);
//     }
// }