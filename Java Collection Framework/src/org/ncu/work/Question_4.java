package org.ncu.arraylist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class canvas_4 {
	public static void main(String[] args) {
		Stack<Integer> drive=new Stack<Integer>();
		Queue<Integer> way=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int local=0;
		drive.push(6789);
		drive.push(5643);
		drive.push(3421);
		drive.push(2314);
		drive.push(8906);
		drive.push(8809);
		int h=0;
		while(h==0) {
		System.out.println("type 1 for adding a car or type 2 for retrieving a car");
		int z=sc.nextInt();
		if (z==1) {
			System.out.println("enter the digits of number plate:");
			int l=sc.nextInt();
			if (drive.search(l)==-1) {
				drive.push(l);
				System.out.println("Car is added to the list.");
				local=1;
			}
			else {
				System.out.println("Similar already exists.");
			}
			
		}
		else {
			System.out.println("enter the digits of number plate-:");
			int l=sc.nextInt();
			if (drive.search(l)==-1) {
				System.out.println("No such found.");
			} 
			else {
				int m=drive.indexOf(l);
				int n=drive.size();
				for (int i = n-1; i >=m; i--) {
					if (i==m) {
						System.out.println("retrieved :"+drive.pop());
						System.out.println("Car removed.");
						System.out.println("Cars in driveway:"+drive.size());
						System.out.println("Cars in street:"+way.size());
					} 
					else {
						int car=drive.pop();
						way.add(car);
					}
				}
				local=1;
			}
			
		}
		
		if (local==1) {
			int q=way.size();
			for (int s = 0; s <q; s++) {
				int b=way.poll();
				drive.push(b);
			}
		}
		System.out.println();
		
		System.out.println("Enter 0 to opt more options of driveway");
		h=sc.nextInt();
		}
	}

}
