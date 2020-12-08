/*
      Map is not child interface of Collection. Both are different things.
      Map is used when we have key value pair.....
      Key is mapped to a value.
                        
       101-->Ravi
       102-->Raju
                  Suppose we are adding (101-->Rahil) again then it will return  "Ravi" , the previous value
                  Key is always unique, value can be same  






 */
package LB1_MapIntroduction;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Map mp=new HashMap();
        System.out.println(mp.put(101,"Raj"));       // returns null
        System.out.println(mp.put(102,"Ravi"));      //returns null
        System.out.println(mp.put(101,"Rahil"));     // returns Raj old value is returned
        
        
        Map mp2=new HashMap();
        mp2.putAll(mp);             //putAll() adds all key-valu pairs to new map mp2 and returns nothing 
    
        System.out.println(mp.get(101));     // get the value at the specified key
        
        System.out.println(mp.remove(102));  //remove specified key-value pair
        
        System.out.println(mp.containsKey(101)); //returns true if above key is present
        
        System.out.println(mp.containsValue("Rahil"));  // returns true if the value is present
        
        System.out.println(mp.size());  //returns size()
        
        
       
    }
    
}
