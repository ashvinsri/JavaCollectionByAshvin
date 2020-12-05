/*
  * Single Direction Iterator which can traverse to forward direction only
  * can only read and remove elements 
  * .iterator() method of collection class returns the iterator object of any cursor class. 
 */
package L8_Iterator;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
         ArrayList<Integer> al=new ArrayList<Integer>();
         al.add(10);
         al.add(11);
         al.add(12);
         al.add(13);
         al.add(14);
         al.add(15);
         Iterator itr=al.iterator();
         while(itr.hasNext())
         {
            Integer i=(Integer)itr.next();
            if(i%2==0)
            {
             System.out.print(itr.next()+" ");
            }
            else
                itr.remove();
            
         }
         
         Stack<Integer> st=new Stack<Integer>();
         st.addAll(al);
         Iterator<Integer> itr1=al.iterator();
         while(itr1.hasNext())
         {
             System.out.print(itr1.next()+" ");
         }
         
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.addAll(al);
        
        itr1=ll.iterator();
        
        while(itr1.hasNext())
         {
             System.out.print(itr1.next()+" ");
             
         }
        
    }
}
