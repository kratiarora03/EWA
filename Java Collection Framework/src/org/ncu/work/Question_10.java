package org.ncu.arraylist;


	import java.util.*;

	class fact extends Thread{
		int n;
		fact(int n){
			this.n=n;
		}
		
		public void run() {
			int f=1;
			for (int i = 1; i <=n; i++) {
				f=f*i;
			}
			System.out.println("Factorial:"+f);
		}
	}

	class factor extends Thread{
		int n;
		factor(int n){
			this.n=n;
		}
		public void run() {
			System.out.println("Factors:");
			for (int i = 1; i <=n; i++) {
				if (n%i==0) {
					System.out.print(i+" ");
				}
			}
		}
	}

	public class Question_10  {

		public static void main(String[] args) throws Exception {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no:");
			int r=sc.nextInt();
			fact f1=new fact(r);
			factor f2=new factor(r);
			f1.start();
			f2.start();
			f1.join();
			f2.join();
			

		}

	}


