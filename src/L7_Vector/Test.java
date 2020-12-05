/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7_Vector;
import java.util.*;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Vector<Integer> v=new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.addElement(11);    //This is legacy method which is equivalent to .add() method
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ////          Enumeration e1=al      so Enumearation can be applied to leagcy classes only
    }
    
}
