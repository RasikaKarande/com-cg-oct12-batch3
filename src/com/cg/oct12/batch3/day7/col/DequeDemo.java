package com.cg.oct12.batch3.day7.col;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class DequeDemo {
 
 	public static void main(String[] args) {
       	Deque<String> obj1 = new LinkedList<String>();
       	Deque<String> obj2 = new ArrayDeque<String>(); 
       	obj1.add("Java");
       	obj1.add("Oracle");
       	obj1.addLast("RPA");
       	obj1.addFirst("Bigdata");
       	obj1.add("Blockchain");
       	System.out.println(obj1);
       	System.out.println(obj1.removeLast());
       	System.out.println(obj1.element());
       	System.out.println(obj1.pollLast());
       	System.out.println(obj1.peek());
       	System.out.println(obj1);
        	obj2.add("Java");
       	obj2.add("Oracle");
       	obj2.addLast("RPA");
       	obj2.addFirst("Bigdata");
       	obj2.add("Blockchain");
       	System.out.println(obj2);
       	System.out.println(obj2.removeLast());
       	System.out.println(obj2.element());
       	System.out.println(obj2.pollLast());
       	System.out.println(obj2.peek());
       	System.out.println(obj2);
 	}
}

