package com.cg.oct12.batch3.day7.col;
import java.util.Vector;
import java.util.Enumeration;
public class VectorDemo {
 	
	public static void main(String[] args) {
       	Vector v = new Vector();
       	System.out.println(v.size()); // size
       	System.out.println(v.capacity()); // capacity
       	for (int i = 10; i <= 100; i += 10) {
            	v.add(new Integer(i));
       	}
       	System.out.println(v.size()); // size
       	System.out.println(v.capacity()); // capacity
        	v.add(110);
       	System.out.println(v.size()); // size
       	System.out.println(v.capacity()); // capacity
  	}
}
