public class RotateAndCheckPalindrome {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2="vivek";
       int k=3;
       int  n1=s1.length();
        int n2 =s2.length();
         int k1 = k%n1;
        int k2 = k%n2;
       
        
        s1=s1.substring(k1-1,n1)+s1.substring(0, k1-1);  // right rotate
        System.out.println(s1);
        s2=s2.substring(k2,n2)+s2.substring(0,k2);  // left rotate
        System.out.println(s2);
         String s3=s1+s2;
         System.out.println(s3);
        //  StringBuilder rev =new StringBuilder(s3);
        //   String reversed=rev.reverse().toString();
       String reversed = new StringBuilder(s3).reverse().toString();
         
        
         System.out.println(reversed);
         if(reversed.equals(s3)){
            System.out.println("true");
         }
         else {
            System.out.println("false");
         }
        
            System.out.println(((Object)reversed).getClass().getSimpleName());
    }
}
