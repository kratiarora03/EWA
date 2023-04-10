package org.ncu.arraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Question_5 {
	

	 public static void main(String[] args) throws FileNotFoundException {
	        HashSet<String> data=new HashSet<>();

	       
	        File file1=new File("C:\\Users\\91978\\Downloads\\dictionary.txt");
	        Scanner sc=new Scanner(file1);

	        
	        while(sc.hasNext()){
	            data.add(sc.next());
	        }

	        File file2=new File("C:\\Users\\91978\\Downloads\\words.txt");
	        sc=new Scanner(file2);

	        System.out.println("the words in the dictionary which are misspelled are -  ");
			
	       
			while(sc.hasNext()) {
				String element = sc.nextLine();
				if(element.length() > 1 && !data.contains(element.toLowerCase()))
						System.out.println(element);
			} 
	    }
	}



