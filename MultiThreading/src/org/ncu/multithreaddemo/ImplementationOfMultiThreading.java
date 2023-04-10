package org.ncu.multithreaddemo;


  class  ImplementationOfMultiThreading extends Thread  {
      public void run() {
    	  for(int i = 0 ; i <= 5 ; i++) {
    		  System.out.println(i + "");
    	  }
      }
  
  
//    	  class ImplementationOfMultiThreading1 extends Thread  {
//    	  public void print() {
//    		  System.out.println("this is second function called ");
//    	  }
//    	  
    	  
    	  
    	  public static void main(String [] args) {
    		  ImplementationOfMultiThreading i1 = new ImplementationOfMultiThreading();
    		  i1.start();
    		  ImplementationOfMultiThreading i2 = new ImplementationOfMultiThreading();
    		  i2.start();
    		  
    		  System.out.println(Thread.currentThread().getName());
    		  Thread.currentThread().setName("delta");
    		  System.out.println(Thread.currentThread().getName());
    		  System.out.println(Thread.currentThread().isAlive());
    		  
    	  
    	  
      }
      
}
