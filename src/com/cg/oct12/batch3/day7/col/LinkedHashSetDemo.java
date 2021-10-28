package com.cg.oct12.batch3.day7.col;
import java.util.*;  
public class LinkedHashSetDemo {
	
	
	public static void main(String args[]){  
	LinkedHashSet<String> set=new LinkedHashSet<String>();  
	set.add("Ravi");  
	set.add("Vijay");  
	set.add("Ravi");  
	set.add("Ajay");  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

