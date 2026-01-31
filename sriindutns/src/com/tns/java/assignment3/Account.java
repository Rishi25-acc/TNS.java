package com.tns.java.assignment3;

public class Account {

		public Account(int accno,String name, int balance) {
			super();
			Accno = accno;
			Name = name;
			Balance = balance;
		}
		int Accno;
		String Name;
		int Balance;
		public int getAccno() {
			return Accno;
		}
		public void setAccno(int accno) {
			Accno = accno;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getBalance() {
			return Balance;
		}
		public void setBalance(int balance) {
			Balance = balance;
		
		}

}
