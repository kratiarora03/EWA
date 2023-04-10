package org.ncu.multithreaddemo;

public class SleepDemo {
	public static void main(String[] args) {
		for(int i = 0 ; i <7 ; i ++) {
			try { 
				Thread.sleep(1000);
			System.out.println(i);
			}
			
			catch ( Exception e ){
				
				System.out.println(e);
				
			}
		}
	}

}
  