package org.ncu.multithreaddemo;

import java.util.Random;

public class randomnumber   extends Thread{
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("Random number generated is"+randomInteger);
			if(randomInteger%2==0) {
				squareThread sq =new squareThread (randomInteger);
				try {
					sq.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sq.start();
			}
			else {
				System.out.println(randomInteger);
			}
		}
	}
} 
	
	


 