package org.ncu.arraylist;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class linkedhashsetdemo {

	public static void main(String[] args) {
List<String> list = new LinkedList<String>();
		
		list.add("India");
		list.add("USA");
		list.add("China");
		list.add("Canada");
		list.add("Germany");
		list.add("France");
		
		System.out.println("List of countries: "+list);
		
		list.add(1, "England");
		
		System.out.println("Element exists: "+list.contains("Canada"));
		
		System.out.println("Find country at given index: "+list.get(4));
		
		System.out.println("Position of Germany is: "+list.indexOf("Germany"));
		
		list.set(1, "Russia");
		
		System.out.println("Updated list of countries: "+list);
		
		Iterator<String> itr = list.iterator();
		
		//itr.next();
		
		// itr.remove(); --> do not call remove directly without calling next()
		
		System.out.println("2nd updated list is: "+list);
		
		ListIterator<String> listItr =  list.listIterator();
		
		listItr.add("Mongolia");
		listItr.add("Nepal");
		
		System.out.println("3rd updated list: "+list);
		
		/*
		 * listItr.next();
		 * 
		 * listItr.set("Taiwan");
		 * 
		 * System.out.println("4th updated list: "+list);
		 */
		
		
		
		
		

	}

}
