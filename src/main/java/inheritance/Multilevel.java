package inheritance;

//Java program to illustrate the  
//concept of Multilevel inheritance 
import java.util.*;
import java.lang.*;
import java.io.*;

class one {
	public void print_geekOne() {
		System.out.println("Geeks");
	}
	
	/*
	 * public void () { System.out.println("Geeks"); }
	 */
}

class two extends one {
	public void print_for() {
		System.out.println("for");
	}
}

class three extends two {
	public void print_geek() {
		System.out.println("Geeks three");
	}
}

class SuperPower {
	public void speedTest() {
		System.out.println("100");
	}

}

class A  {
	public void speedATest() {
		System.out.println("70");
	}
}

class B extends SuperPower {
	public void speedBTest() {
		System.out.println("20");
	}
}

