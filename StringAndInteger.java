import java.util.*;

public class StringAndInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter int value");
        int n = sc.nextInt();
         sc.nextLine(); // clear buffer after int
        
        System.out.println("enter string or int");
        String typed = sc.nextLine();
        
        if (typed.equalsIgnoreCase("STRING")) {
            String str[] = new String[n];
            // System.out.println("Enter " + n + " strings:");
            
            for (int i = 0; i < n; i++) {
                str[i] = sc.nextLine();
            }
            
            int maxlen = 0;
            for (int i = 0; i < n; i++) {
                int len = str[i].length();
                if (len > maxlen) {
                    maxlen = len;
                }
            }
            System.out.println("Maximum length of strings: " + maxlen);
            
        } else if (typed.equalsIgnoreCase("INT")) {
            int arr[] = new int[n];
            System.out.println("Enter " + n + " integers:");
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of integers: " + sum);
        }
    }
}
