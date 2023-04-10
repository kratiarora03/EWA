package org.ncu.multithreaddemo;

public class consumerproducer {
	
		private BankAccount bankAccount;
		
		public consumerproducer() {
			bankAccount = new BankAccount(10000);
		}
		
	
			public void run() {
				
			}
		() {
			/*
			 * Ryan - Consumer thread 
			 * Monica - Producer thread
			 */
			if(Thread.currentThread().getName() == "Ryan") {
				bankAccount.makeWithdrawl(15000);
			}else if(Thread.currentThread().getName() == "Monica") {
				bankAccount.makeDeposit(10000);
			}
	
