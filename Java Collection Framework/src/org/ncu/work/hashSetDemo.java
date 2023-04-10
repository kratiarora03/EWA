package org.ncu.arraylist;

import java.util.HashSet;
import java.util.Set;

public class hashSetDemo {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("tesla");
		set1.add("suzuki");
		set1.add("mahindra");
		set1.add("tata");
		set1.add("hyundai");
		set1.add("toyota");
		
		System.out.println("set of cars " + set1);
		
		
		Set<String> set2 = new HashSet<String>();
		set2.add("ducati");
		set2.add("royal enfield");
		set2.add("tvs");
		set2.add("hero");
		set2.add("suzuki");
		set2.add("honda");
		
		
		System.out.println("set of bikes " + set2);
		
		//union of sets 
		//set1.addAll(set2);
		
		
		//System.out.println("union of two sets - " + set1);
		
		//set1.retainAll(set2);
		//System.out.println("intersection of two sets" + set1);
		
		
		set1.removeAll(set2);
		System.out.println("difference between two sets" + set1); 
		

		
		
		
		

	}

}
