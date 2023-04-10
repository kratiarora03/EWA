package org.ncu.arraylist;

import java.util.Random;
import java.util.Scanner;

public class canvas_9 {
	//initiate the terms
	class q7 extends Thread{
		int run;
		q7(int run){
			this.run=run;
		}
		
		public void run() {
			System.out.println("Square:"+(run*run));
		}
	}
	
	//call in the methods

	class value extends Thread{
		int we;
		value(int we){
			this.we=we;
		}
		
		public void run() {
			System.out.println("Value:"+we);
		}
	}

  // form the thread
	class Randomno extends Thread{
		public void run() {
			Scanner sc=new Scanner(System.in);
			Random R=new Random();
			for (int i = 0; i <10; i++) {
				int rn=R.nextInt(100);
				System.out.println("Num:"+rn);
				if (rn%2==0) {
					q7 s=new q7(rn);
					s.start();
				} 
				else {
					value v=new value(rn);
					v.start();
				}
				try {
					sleep(50);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			
		}
	}


//construct the main class

	public class ThreadClass {

		public static void main(String[] args) {
			Random ran=new Random();
		 ran.start();

		}

	}
}
