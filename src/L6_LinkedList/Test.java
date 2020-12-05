/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6_LinkedList;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(12);
        ll.add(13);
        ll.add(14);
        System.out.println(ll.get(1));
        System.out.println(ll.getFirst());
    }
}
