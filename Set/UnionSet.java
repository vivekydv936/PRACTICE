
import java.util.*;

import javax.xml.xpath.XPathEvaluationResult;

public class UnionSet {
    public static void main(String[] args) {
        
        Set<Integer> myset1 =new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> myset2 =new HashSet<>(Arrays.asList(1,2,3,4,5,6));
            // union
        // myset1.addAll(myset2);
        // System.out.println(myset1);

         // intersection

        //  myset1.retainAll(myset2);
        //  System.out.println(myset1);

        //   set difference
        // myset1.removeAll(myset2);
        System.out.println(myset1);
        
       

    }
}
