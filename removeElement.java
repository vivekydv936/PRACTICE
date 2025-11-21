public class removeElement {
    public static void main(String[] args) {
        int[] nums = {2,4,1,6,1,8,4,1,5};
        int n = nums.length;
        
        // Count occurrences of 1
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count++;
            }
        }
        
        // Remove elements starting from position count
        for(int i = count; i < n-1; i++) {
            nums[i] = nums[i+1];
        }
        
        // Print array excluding last element
        for(int i = 0; i < n-1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}