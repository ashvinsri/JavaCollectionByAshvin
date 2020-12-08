/*
 *   If u want that your insertion order is preserved and duplicates not allowed then go for Linked Hash Set
 *
 */
package LA3_LinkedHashSet;
import java.util.*;
public class Test {
    public static void main(String args[])
    {
        HashSet<String> hs=new LinkedHashSet<String>();
        hs.add("Ashvin");
        hs.add("Supreet");
        hs.add("Aman");
        hs.add("Bahraich");
        System.out.print(hs);
    }
}
