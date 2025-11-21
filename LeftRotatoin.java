public class LeftRotatoin {
    public static void main(String[] args) {
        String s="problem";
        int k=3;
        int n=s.length();
        s=s.substring(k,n)+s.substring(0, k);
        System.out.println(s);

        String s2="brown";
    int k2=2;
    int n2=s2.length();
    s2=s2.substring(n2-k2,n2)+s2.substring(0,k2+1);
    System.out.println(s2);

    }

    
    


}
