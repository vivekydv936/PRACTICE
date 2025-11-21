
public class REmove_From_Selected_14 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "ihedfghj";
        int n1 = s1.length();
        int n2 = s2.length();

        
        boolean[] present = new boolean[256];
        for (int i = 0; i < n2; i++) {
            present[s2.charAt(i)] = true;
        }

     
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n1; i++) {
            char c = s1.charAt(i);
            if (!present[c]) {
                result.append(c);
            }
        }

        System.out.println(result.toString()); 
    }
}
