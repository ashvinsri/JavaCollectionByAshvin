/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_ArrayListClass;
import java.util.*;
/**
 *  implements List Interface 
 * (1) Resizable and growable   (2) Allows duplicate   (3) Insertion Order preserved  (4) Can hold hetrogeneous objects  (5) Null insertion allowed
 */
public class Test {
    public static void main(String args[])
    {
        
        List al=new ArrayList();
        al.add(1);
        al.add("Ashvin");           //Yes we can add hetrogeneous objects in List
        al.add(2.5);
        al.add(true);
        
        System.out.println(al);
        
        /* So We are getting a warning message that it is not type  safe exactlyyyyyyy   so we must use generics so that our data becomes type safe*/
        
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ashvin");
        al2.add("Srivastava");
        al2.add("Supreet");
        al2.add("Srivastava");
        
        ArrayList<String> al3=new ArrayList<String>(al2);
        
        System.out.println(al3);
        
    }
    
}
