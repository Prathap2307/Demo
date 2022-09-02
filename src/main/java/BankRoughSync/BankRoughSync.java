package BankRoughSync;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Java Program to illustrate Multithreading Approach
//With Synchronization In Banking transaction system

//Class 1
//Helper class
class Bank {

	// Initial balance $100
	int total = 100;
	String a = "ertr";

	// Set<Integer> cars = new HashSet<Integer>();
	// cars.add(1);

	List<String> listTest = new ArrayList<>();

	public List<String> getListTest() {
		return listTest;
	}

	public void setListTest(List<String> listTest) {
		this.listTest = listTest;
	}

	StringBuffer sBuffer = new StringBuffer("p ");
	StringBuilder sBuilder = new StringBuilder("p ");

	// Money withdrawal method. Withdraw only if total money
	// greater than or equal to the money requested for
	// withdrawal
	void withdrawn(String name, int withdrawal) {

		listTest.add(name);

		// listTest.remove(name);
		// System.out.println("name -->" + name);
		// System.out.println("listTest -->" + listTest);

		// sBuffer.replace(0, 3, "prat");
		// sBuilder.replace(0, 3, "prat");
		//System.out.println("before StringBuffer -->" + sBuffer);
	//	System.out.println("before StringBuilder -->" + sBuilder);
		sBuffer.append(" " + name);
		sBuilder.append(" " + name);
		System.out.println("after StringBuffer -->" + sBuffer);
		System.out.println("after StringBuilder -->" + sBuilder);

		if (total >= withdrawal) {
			// System.out.println(name + " withdrawn " + withdrawal);

			total = total - withdrawal;
		//	System.out.println("Balance after withdrawal: " + total);
			/*
			 * Making the thread sleep for 1 second after each withdrawal.
			 */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		// If the money requested for withdrawal is greater
		// than the balance then deny transaction
		else {
			// System.out.println(name + " you can not withdraw " + withdrawal);

			// System.out.println("your balance is: " + total);

			// Making the thread sleep for 1 second after
			// each transaction failure

			// Try block to check for exceptions
			try {

				// Making thread to sleep for 1 second
				Thread.sleep(1000);
			}

			// Catch bloc kto handle exceptions
			catch (InterruptedException e) {

				// Display the line number where exception
				// occurred
				// Using printStackTrace() method
				e.printStackTrace();
			}
		}

	}

	// Method - Deposit method
	// Accepting money whenever deposited
	void deposit(String name, int deposit) {

		// System.out.println(name + " deposited " + deposit);
		total = total + deposit;
		// System.out.println("Balance after deposit: " + total);

		// Making the thread sleep for 1 second
		// after each deposit

		// Try block to check for exceptions
		try {

			// Making thread to sleep for 1 second
			Thread.sleep(1000);
		}

		// Catch block to handle InterruptedException
		// exception
		catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

//Method - Withdraw
//It is called from ThreadWithdrawal class using
//the object of Bank class passed from the main method
class ThreadWithdrawal extends Thread {

	// Attributes of this class
	Bank object;
	String name;
	int dollar;

	// Constructor of this class
	ThreadWithdrawal(Bank ob, String name, int money) {
		// This keyword refers to parent class
		this.object = ob;
		this.name = name;
		this.dollar = money;
	}

	// run() method for the thread
	public void run() {
		object.withdrawn(name, dollar);
	}
}

//Deposit method is called from ThreadDeposit class using
//the object of Bank class passed from the main method*/

//Class 2
//Helper class extending Thread class
class ThreadDeposit extends Thread {

	Bank object;
	String name;
	int dollar;

	ThreadDeposit(Bank ob, String name, int money) {
		this.object = ob;
		this.name = name;
		this.dollar = money;
	}

	public void run() {
		object.deposit(name, dollar);
	}
}

//Class 3
//Main class

public class BankRoughSync {
	// Main driver method
	public static void main(String[] args) {
		// Declaring an object of Bank class and passing the
		// object along with other parameters to the
		// ThreadWithdrawal and ThreadDeposit class. This
		// will be required to call withdrawn and deposit
		// methods from those class

		// Creating object of above class inside main()
		Bank obj = new Bank();
		List<String> listTest = Arrays.asList("test 1");
		// obj1.setListTest(listTest1);

		Bank obj2 = new Bank();
		List<String> listTest2 = Arrays.asList("test 2");
		// obj1.setListTest(listTest2);

		Bank obj3 = new Bank();
		List<String> listTest3 = Arrays.asList("test 3");
		// obj1.setListTest(listTest3);

		Bank obj4 = new Bank();
		List<String> listTest4 = Arrays.asList("test 4");
		// obj1.setListTest(listTest4);

		Bank obj5 = new Bank();
		List<String> listTest5 = Arrays.asList("test 5");
		// obj1.setListTest(listTest5);

		// Creating threads
		ThreadWithdrawal t1 = new ThreadWithdrawal(obj, "Arnab", 20);
		ThreadWithdrawal t2 = new ThreadWithdrawal(obj, "Monodwip", 40);
		ThreadDeposit t3 = new ThreadDeposit(obj, "Mukta", 35);
		ThreadWithdrawal t4 = new ThreadWithdrawal(obj, "Rinkel", 80);
		ThreadWithdrawal t5 = new ThreadWithdrawal(obj, "Shubham", 40);

		// When a program calls the start() method, a new
		// thread is created and then the run() method is
		// executed
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		// Bank obj = new Bank();

	}
}
