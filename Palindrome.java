public class Palindrome {
    public static void main(String[] args) {
        String s = "madam1";
        // StringBuilder raw =new StringBuilder(s);
        // raw.reverse().toString();
        // System.out.println(raw);
        String rev = new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.println();
    }
}
