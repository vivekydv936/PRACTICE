import java.util.*;
public class InsertInString {
    // public static void main(String[] args) {
    //     StringBuilder sb =new StringBuilder();
    //     sb = sb.append("quick fox");
    //     String s = "# ";
    //     int idx =2;
    //     StringBuilder finalstr= new StringBuilder();
    //     for(int i = 0; i < sb.length(); i += idx) {
    //         int end = Math.min(i + idx, sb.length());
    //         finalstr.append(sb.substring(i, end)).append(s);
    //     }
        
    //     System.out.println(finalstr);
    // }

    public static void main(String[] args) {
        StringBuilder res =new StringBuilder();
        String str = "quickfox";
        // char ch[]=str.toCharArray();
        int n = str.length();
        String s = "#";

        for(int i=0;i<n;i++){
            res.append(str.charAt(i));
            if ((i+1)%n ==0 ){
                res.append(s);
            }
            
        }

        System.out.println(res);
        

    }

}
