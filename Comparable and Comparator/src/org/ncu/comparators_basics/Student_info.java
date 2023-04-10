package org.ncu.comparators_basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student_info {
	private int id;
	private String name ;
	private double cgpa ; 
	public Student_info(String name , int id ,double cgpa ) {
		super();
		this.id = id;
		this.name= name ;
		this.cgpa = cgpa;
		
	}
	
	public Student_info(int id2, String name2, double cgpa2) {
		// TODO Auto-generated constructor stub
	}

	public int getid() {
		return id;
	}
	
	public int setid(int id) {
		return this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public double getcgpa() {
		return cgpa;
	}
	
	public void setcgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		ArrayList<Student_info> studentlist = new ArrayList<>();
	 while(input>0) {
		 int id = sc.nextInt();
		 String name = sc.next();
		 double cgpa = sc.nextDouble();
		 
		 
		 Student_info st = new Student_info(id , name , cgpa);
		 studentlist.add(st);
	 
		 input--;
	 }
	 
	 Collections.sort (studentlist, new Comparator<Student_info>() {
		@Override
		public int compare(Student_info s1 , Student_info s2) {
			if(s2.getcgpa()< s1.getcgpa()) {
				return 1;
			} else 
				if (s2.getcgpa()> s1.getcgpa()) {
					return -1 ; 
			}
			 return 
					 
					 s1.getName().compareTo(s2.getName());
		}

		public int compare1(Student_info s1, Student_info s2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
					 
					 
	}
	 );
	 
	 for(Student_info st: studentlist) {
		 System.out.println(st.getName());
	 
	 
		 
		
	}
	
		
		
	
		
	
		
	}

}
