package MultipleInheritance;

/*
 * public class testMultiple {
 * 
 * }
 */


class Mini extends Large  {
	public void printMini()
	{
		System.out.println("printMini"); 
	}
}

class Maxi {
	public void printMaxi() {
		System.out.println("printMaxi"); 
	}
}


class Large  {
	public void printLarge() {
		System.out.println("printLarge"); 
	}
	
}
