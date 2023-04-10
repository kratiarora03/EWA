package org.ncu.multithreaddemo;

 class PriorityThreadDemo extends Thread {
	 public void run() {
		 System.out.println("this is a child class ");
		 System.out.println( Thread.currentThread().getPriority());
	 }
	 public static void main(String[] args) {
		 System.out.println(Thread.currentThread().getPriority());
		 PriorityThreadDemo p1 = new PriorityThreadDemo();
		 p1.start();
		 
		 
	}
	

}
