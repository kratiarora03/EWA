


    package org.ncu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("nike");
		list.add("adidas");
		list.add("puma");
		list.add("reebok");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2,"puma");
		System.out.println("updated list - " + list);
		list.set(3, "burberry");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("puma"));
		Iterator<String> itr  = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator<String> listitr = list.listIterator();
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
	}

}
