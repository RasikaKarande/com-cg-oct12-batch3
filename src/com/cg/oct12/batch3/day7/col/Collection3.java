package com.cg.oct12.batch3.day7.col;
import java.util.*; 
public class Collection3 {
 	public static void main(String args[]) {
       	LinkedList l1 = new LinkedList();
       	l1.add(10);
       	l1.add(10.5);
       	l1.add("RASIKA");
       	for (int num = 0; num < l1.size(); num++) {
            	System.out.println(l1.get(num));
       	}
       	// for (LinkedList obj : (LinkedList)l1) {
       	// System.out.println(obj);
       	// }
       	Iterator i = l1.iterator();
       	while (i.hasNext()) {
            	System.out.println(i.next());
       	}
 	}
}

