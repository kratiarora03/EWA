package org.ncu.arraylist;

import java.util.HashMap;
import java.util.Map;

public class hasgmapquestion {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("carl","B+");
		map1.put("joe","C");
		map1.put("sarah","A");
		
		System.out.print("name of students and their grade - : "+map1);
		
		System.out.println("name of students and thier grades as per array- : "+map1.entrySet());

		System.out.println("name of the students: "+map1.keySet());
		
		System.out.println("grades of the students: "+map1.values());
		
		
		
		

	}

}
