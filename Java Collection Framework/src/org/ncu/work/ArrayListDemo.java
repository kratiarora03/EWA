/*1. transversal 
 * insertion 
 * delete 
 * updation 
 * search 
 */

package org.ncu.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//create an arraylist object
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Microsoft");
		list1.add("Amazon");
		list1.add("Netflix");
		list1.add("Disney");
		
		//transversing 
	/*for(int i = 0; i<list1.size(); i++){
		System.out.println(list1.get(i));
			
		}*/
	for(String str : list1){
		System.out.println(str);
	}
	System.out.println ("element deleted " + list1.remove(2));
	System.out.println("updated list" + list1);
	list1.add(2,"TCS");
	System.out.println("added new element at pos 2 " +list1);
	list1.set(2,"deliotte");
	System.out.println("the updated name for 2 is " +list1);
	System.out.println("list contains TCS:" + list1.contains("TCS"));
	System.out.println("===============transversal using iterator=============");
	Iterator<String> itr = list1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("==================reverse iterator ================");
	ListIterator<String>listItr=   list1.listIterator(list1.size());
	while(listItr.hasPrevious()) {
		System.out.println(listItr.previous());
	}
	}
	
}
	


