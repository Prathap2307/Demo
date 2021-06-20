package MultipleInheritance;

//Java program to illustrate the 
//concept of Multiple inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

interface one 
{ 
	public void print_geekOne(); 
} 

interface two 
{ 
	public void print_for(); 
} 

interface three extends one,two 
{ 
	public void print_geek(); 
} 
class child implements three 
{ 
	@Override
	public void print_geek() { 
		System.out.println("Geeks"); 
	} 
	
	public void print_geekOne() { 
		System.out.println("One inh "); 
	} 

	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 



