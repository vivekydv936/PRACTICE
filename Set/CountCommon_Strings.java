import java.util.*;

public class CountCommon_Strings {
    public static void main(String[] args) {
        String S1 ="Quickbrownfox";
        String S2 ="Learnfromlearnys";
        Set<Character> myset1 =new TreeSet<>();
        Set<Character> myset2 =new TreeSet<>();

        for(char c : S1.toCharArray()) {
            myset1.add(c);
        }

        for(char c : S2.toCharArray()) {
            myset2.add(c);
        }

         myset1.retainAll(myset2);
         System.out.println("Common characters: " + myset1);
         System.out.println("Number of common characters: " + myset1.size());
    }
}
