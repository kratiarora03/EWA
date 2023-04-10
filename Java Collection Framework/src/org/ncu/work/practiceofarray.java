package org.ncu.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class practiceofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list1 = new ArrayList<>();
		list1.add("krati");

		list1.add("gudda");

		list1.add("you");

		list1.add("hello");

		list1.add("sahil");
	    for(int i = 0 ; i<list1.size(); i++) {
	    	System.out.println(list1.get(i));
	    }
	    	
	    	list1.remove(2);
	    	System.out.println("updated list" + list1);
	    	
	    	list1.add(2,"dugguuu");
	    	System.out.println(list1);
	    	
	    	System.out.println( " list contains sahil : " +list1.contains("sahil"));
	    	
	        list1.set(2, "subwAy");
	        System.out.println("updated list" + list1);
	    
	    	
	    

		
		
	

	}

}
