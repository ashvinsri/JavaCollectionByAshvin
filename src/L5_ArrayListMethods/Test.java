/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_ArrayListMethods;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");         //.add(int i,String s)---> adds the particular value at index i..
        al.add(2,"D");
        al.add("E");
        al.add("F");
        
        
        al.remove("B");     //removes B and returns boolean
        String s=al.remove(2);  //renmoves value at index 2 returns String
        System.out.println(s);
        
        System.out.println(al.get(1));  //get method returns value at index i
        
        System.out.println(al);
        
        System.out.println(al.set(2, "G"));   //returns previous elements 
        
        System.out.println(al);      
       
        System.out.println(al.indexOf("G"));  // returns index of the specified object
       
        System.out.println(al.lastIndexOf("C")); //returns the index of last occurrence of C
        
    }
}
