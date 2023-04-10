package org.ncu.arraylist;


	import java.util.*;

	class Hellojava extends Thread{
		
		 int count;
		Hellojava(int count){
			this.count=count;
		}
		public void run(){
			if (count<50) {
				createThread(count+1);
			}
			System.out.println("Hello from Thread"+count);
			
		}
		
		public void createThread(int n) {
			Hellojava tt=new Hellojava(n);
			tt.start();
			try {
				tt.join();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}


	public class Question_12 {

		public static void main(String[] args) {
			Hellojava t=new Hellojava(1);
			t.start();
			System.out.println(t);
		}

	}


