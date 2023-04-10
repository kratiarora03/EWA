package org.ncu.arraylist;



	class ProducerConsumerquestion implements Runnable {
		private BankAccount bankAccount;
		
		public ProducerConsumerquestion() {
			bankAccount = new BankAccount(10000);
		}
		
		@Override
		public void run() {
			if(Thread.currentThread().getName() == "Ryan") {
				bankAccount.makeWithdrawl(15000);
			}else if(Thread.currentThread().getName() == "Monica") {
				bankAccount.makeDeposit(10000);
			}
		}
	}
	class BankAccount {
		private int balance;
		
		public BankAccount(int balance) {
			this.balance = balance;
		}
		
		public int getBalance() {
			return this.balance;
		}
		
		synchronized void makeWithdrawl(int amt) {
			System.out.println("Available Balance in the account: "+this.getBalance()+"$");
			System.out.println(Thread.currentThread().getName()+" is going to withdraw from the bank is "+amt+"$");
			while(this.getBalance() < amt) {
				System.out.println("Insufficient balance in the account !! waiting for deposit to get updated in the account...");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.balance = this.getBalance() - amt;
			System.out.println(amt+"$  amount withdrawn successfully by "+Thread.currentThread().getName());
			System.out.println("Updated Balance amount after withdraw from the bank is : "+this.getBalance()+"$");
		}
		
		synchronized void makeDeposit(int amount) {
			System.out.println(Thread.currentThread().getName()+" is going to deposit in the bank "+amount+"$");
			this.balance = this.getBalance() + amount;
			System.out.println("Updated Balance amount after deposit from the bank : "+this.getBalance()+"$");
			notify();
		}
	}

	public class Question_13{

		public static void main(String[] args) {
			ProducerConsumerquestion p = new ProducerConsumerquestion();
			Thread t1 = new Thread(p, "Ryan");
			Thread t2 = new Thread(p, "Monica");
			t1.start();
			t2.start();
		}
	}



