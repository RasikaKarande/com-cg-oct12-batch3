package com.cg.oct12.batch3.day7.col;
import java.util.*;
 
public class QueueDemo2 {
 	public static void main(String[] args) {
       	Random r = new Random();
       	PriorityQueue q = new PriorityQueue();
       	for (int i = 1; i <= 10; i++) {
            	q.add(new Integer(r.nextInt(5)));
       	}
       	System.out.println("Elements : " + q);
 	}
}
