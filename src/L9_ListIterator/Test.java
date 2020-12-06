/*
 * List iterator is bidirectional iterator where we can traverse next and previous element
 * In addition to traversing ad removing we can add and replace also
 */
package L9_ListIterator;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ashvin");
        al.add("Supreet");
        al.add("Visu");
        al.add("Vasu");
        
        ListIterator<String> itr=al.listIterator();
        System.out.println("From Left to RIght is:-");
        while(itr.hasNext())
        {
            String s=itr.next();
            if(s.equals("Visu"))             //  In ListIterator we can use set(Obj o) method to replace an object
                itr.set("Motu");
            else if(s.equals("Vasu"))
                itr.add("Angry Bird");      // In list iterator we cann add also
            System.out.print(s+" ");
            
        }
        System.out.println();
        System.out.println("From Right to Left is:-");
        
        while(itr.hasPrevious())
        {
            System.out.print(itr.previous()+" ");
        }
    }
}
