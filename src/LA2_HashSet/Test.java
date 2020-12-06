/*
 *  Hash Set
 *
 */
package LA2_HashSet;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    
    public static void main(String args[])
    {
        HashSet hs=new HashSet();
        hs.add(1);
        hs.add(2);
        System.out.println(hs.add("Ashvin"));   //returns true as it is allowed first time 
        hs.add(2);
        hs.add("Supreet");
        hs.add(null);
        hs.add(null);    /// cant insert twice
        System.out.println(hs.add("Ashvin"));   // but next time it will return false No COmpile time Error noException it will ignore
        
             
    }
    
}
