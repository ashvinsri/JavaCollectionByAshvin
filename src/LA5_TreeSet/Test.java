/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LA5_TreeSet1;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        SortedSet s=new TreeSet();
        s.add("A");
        s.add("B");
        s.add("C");
        System.out.println(s);
        s.add(1);   // It will raise a RunTime Exception: Class Cast Exception as we are trying to add hetrogenous object
        System.out.println(s);
    }
}
class A
{
    public static void main(String args[])
    {
        SortedSet<String> st=new TreeSet<String>();
        st.add("A");
        st.add("B");
        System.out.println(st);
        
        SortedSet<StringBuffer> sb=new TreeSet<StringBuffer>();
        sb.add(new StringBuffer("Ashvin"));
        sb.add(new StringBuffer("Raj"));
        System.out.println(sb);
    }
}
