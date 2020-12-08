/*
 * Sorted Set is Child Interface of Set Interface
 * If we want to group individual object according to some sorted Order without duplicates then we should go for #Sorted_Set
 */
    
package LA4_SortedSet;
import java.util.*;

public class Test
{
    public static void main(String args[])
    {
        SortedSet<Integer> st=new TreeSet<Integer>();
        st.add(101);
        st.add(104);
        st.add(103);
        st.add(102);
        st.add(106);
        System.out.println(st.first());   //returns first element of Set
        System.out.println(st.last());    //returns last element of set
        System.out.println(st.headSet(105)); //returns head Set
        System.out.println(st.tailSet(104)); //returns tail set
        System.out.println(st.subSet(100, 105));  //returns Subset
        
    }
}
