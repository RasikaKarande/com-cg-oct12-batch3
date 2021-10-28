package com.cg.oct12.batch3.day7.col;
 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
 
public class QueueDemo1 {
 
 	public static void main(String[] args) {
 
       	Queue<String> obj1 = new LinkedList<String>();
       	Queue<String> obj2 = new PriorityQueue<String>();
        	Random r = new Random();
 
       	for (int i = 1; i <= 5; i++) {
            	int j = r.nextInt(10);
            	obj1.add("A" + j);
            	obj2.add("A" + j);
       	}
       	System.out.println(obj1);
       	System.out.println(obj1.remove());
       	System.out.println(obj1.poll());
       	System.out.println(obj1.peek());
       	System.out.println(obj1);
 
       	System.out.println(obj2);
       	System.out.println(obj2.remove());
       	System.out.println(obj2.poll());
       	System.out.println(obj2.peek());
       	System.out.println(obj2);
 	}
}

