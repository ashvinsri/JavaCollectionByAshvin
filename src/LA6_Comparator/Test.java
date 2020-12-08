/*
 * Comparator is used when we have to use custom sorting...
 * Comparable is used when we have to follow Default Natural Sorted Order it contains only one method "public int compareTo()"
 * Comparator has two methods "public int Compare()" and "public boolean equals()"
 */
package LA6_Comparator;
import java.util.*;
/**
 *
 * @author DELL-PC
 */

class MyComparator implements Comparator
{
    public int compare(Object a,Object b)
    {
        Integer x=(Integer)a;
        Integer y=(Integer)b;
        if(x<y)
            return +1;
        else if(x>y)
            return -1;
        else
            return 0;
        
    }
}
public class Test {
    public static void main(String args[])
    {
        TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
        ts.add(15);
        ts.add(20);
        ts.add(14);
        ts.add(24);
        ts.add(11);
        System.out.print(ts);
    }
    
}

class MyComparator2 implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        return 1;                              // this means insertion order is preserved as ob1 is always added after obj2;
    }
}
class A
{
    public static void main(String args[])
    {
        TreeSet<Integer> ts1=new TreeSet<Integer>(new MyComparator2());
        ts1.add(21);
        ts1.add(11);
        ts1.add(19);
        ts1.add(14);
        ts1.add(0);
        System.out.print(ts1);
        
    }
    
}
class B
{
    public static void main(String args[])
    {
        TreeSet<Integer> ts1=new TreeSet<Integer>(new Comparator()              //Another way of writing the Comparator 
        {
            public int compare(Object obj1,Object obj2)
            {
                return -1;   //returns reverse of insertion order as all element will be inserted to left
            }
        }
        );
        ts1.add(21);
        ts1.add(11);
        ts1.add(19);
        ts1.add(14);
        ts1.add(0);
        System.out.print(ts1);
        
    }
}













