package functionalInterface;

public class HouseImplementation implements House  {
	
	public static void main(String[] args) {
	
		HouseImplementation test = new HouseImplementation();
		test.ownerMethod();
		System.out.println(test.rentMethod("prathjap"));
		
		System.out.println(House.Payment(1000d));
		
	}
	
	@Override
	public void ownerMethod(){
		System.out.println("im the owner of the house");
	}
	
	/*
	 * public String rentMethod(String s){ return "House rented to override + e" +
	 * s; }
	 */
}

@FunctionalInterface
interface House {
	
	void ownerMethod();
	
	default String rentMethod(String s) {
		
		return "House rented to " + s;
	}
	
default String rentMethodttt(String s) {
		
		return "House rented to " + s;
	}
	
	public static String Payment(double amount) {
		
		return "rent amount paid " + amount;
	}
	 
}