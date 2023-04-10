package org.ncu.multithreaddemo;

import java.util.Scanner;

 class  factorial_question_demo extends Thread {
	 
 Scanner sc = new Scanner(System.in);
 int i,fact = 1;
 int number = sc.nextInt();
 
	public void FactorialReturn() {
		for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
	}
	
	class factors extends Thread{
		int data = sc.nextInt();
		
		public void FactorReturn() {
			for (int i = 1; i <= number; ++i) {
			      if (number % i == 0) {
			        System.out.print(i + " ");
			      } }
			}}
            
            public static void main(String args []) {
            	factorial_question_demo f1 = new factorial_question_demo();
            	           	
            	f1.start();
            	
            	factors f2 = new factors();
            	
            	
            	
            	try {
        			f1.join();
        		} catch (InterruptedException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}		
        	}
            	
            }
            	
            
	
