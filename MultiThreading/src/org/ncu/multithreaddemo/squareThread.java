package org.ncu.multithreaddemo;

public class squareThread extends Thread {
	int n;
	squareThread(int randomNumber ){
		n=randomNumber ;
	}
	public void run() {
		int sqr=n*n;
		System.out.println("Square of random integer "+n+"is "+sqr);
		}
	public static void main(String[] args) {
		randomnumber rn=new randomnumber();
		rn.start();
	}
}
	


