package org.ncu.multithreaddemo;

public class SLeepDemo2 extends Thread  {
	 public void run() {
		 for( int i= 0 ; i< 7 ; i++ ){
			 try { Thread.sleep(1000);
			    System.out.println(i);
			 } catch(Exception e ) {
				 System.out.println(e);
			 }
			 
		 }
	 }
	 
	 public static void main(String[] args) {
		 SLeepDemo2 t1 = new SLeepDemo2();
		 t1.start();
	}

}

