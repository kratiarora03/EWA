package org.ncu.multithreaddemo;

public class MyThread extends Thread {
	String threadname;
	public MyThread ( String threadname) {
		this.threadname = threadname;
		
	}
	
	public void run() {
		Thread.currentThread().setName(threadname);
		
	}

}




