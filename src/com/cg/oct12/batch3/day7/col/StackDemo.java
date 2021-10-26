package com.cg.oct12.batch3.day7.col;
import java.util.*;
public class StackDemo {
 	public static void main(String[] args) {
 	      Stack<Integer> s1 = new Stack<Integer> ();
 	      s1.push (123);
 	      s1.push (956);
 	      s1.push (89);
 	      s1.push(51);
//System.out.println ("check whether stack is empty?” + s1.empty());
 	 System.out.println ("Top element of stack is: "+s1.peek ());
 System.out.println ("Element removed from stack is: "+s1.pop ());
 	      System.out.println ("stack elements after removal: "+s1);
System.out.println("Check for element '56' in stack:"+s1.search (56));
 	}
}
