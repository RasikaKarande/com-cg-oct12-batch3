package com.cg.oct12.batch3.day7.col;
import java.util.*;  
public class TreeSetDemo {
	
	
	public static void main(String args[]){  
	//Creating and adding elements  
	TreeSet<String> set=new TreeSet<String>();  
	set.add("Ram");  
	set.add("Rasika");  
	set.add("Rasika");  
	set.add("Ajay");  
	set.add("Amay"); 
	set.add("Anay"); 
	//traversing elements  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  

