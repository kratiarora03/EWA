package org.ncu.arraylist;


	import java.util.*;

	class Bank{
		int amount;
		Bank(int p){
			amount=p;
		}
		
		void withdraw(int n){
			if (n>amount) {
				System.out.println("Not enough amt in the bank.\n"+amount);
			} else {
				amount=amount-n;
				System.out.println("Amt left in the bank is:"+amount);
			}
		}
		
		void deposit(int a){
			amount=amount+a;
			System.out.println("Total Amt in the bank:"+amount);
		}
		
		
	}

	class Ryan extends Thread{
		Bank q;
		Ryan(Bank q){
			this.q=q;
		}
		
		
		public void run() {
			synchronized (q) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Ryan 1 To Withdraw. \t2 to Deposit ");
				System.out.println("Enter Choice");
				int n=sc.nextInt();
				if (n==1) {
					System.out.println("Enter amt to be withdrawn:");
					int c=sc.nextInt();
					q.withdraw(c);
				} 
				else {
					System.out.println("Enter amt to deposit:");
					int c=sc.nextInt();
					q.deposit(c);
				}
			}
		}
	}

	class Monica extends Thread{
		
		Bank b;
		Monica(Bank b){
			this.b=b;
		}
		
			public void run() {
				synchronized (b) {
					Scanner sc=new Scanner(System.in);
					System.out.println(" Monica 1 To Withdraw. \t2 to Deposit ");
					System.out.println("Enter Choice you want to opt for ");
					int n=sc.nextInt();
					if (n==1) {
						System.out.println("Enter amt to be withdrawn from the bank:");
						int c=sc.nextInt();
						b.withdraw(c);
					} 
					else {
						System.out.println("Enter amt to deposit in the bank :");
						int c=sc.nextInt();
						b.deposit(c);
					}
				}
			
		}
	}


	public class Question_11 {

		public static void main(String[] args) {
			Bank b=new Bank(10000);
			Ryan t=new Ryan(b);
			Monica tt=new Monica(b);
			t.start();
			tt.start();
			try {
				t.join();
				tt.join();
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}



