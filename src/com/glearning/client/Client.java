package com.glearning.client;

import com.glearning.service.TransactionService;

public class Client {
	
	public static void main(String[] args) {
		TransactionService transactionService = new TransactionService();
		//ask for the number of transactions using system.in
		//create an array of length
		//populate the array with the values using scanner class
		
		
		int[] inputTransactions = new int[] {100, 200, 400, 500, 600};
		int target = 15000;
		transactionService.checkTransactionTarget(inputTransactions, target);
	}

}

