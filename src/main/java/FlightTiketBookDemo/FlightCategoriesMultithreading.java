package FlightTiketBookDemo;

public class FlightCategoriesMultithreading  implements Runnable {

	static final int ECONOMY_CLASS = 3;
	static final int BUSINESS_CLASS = 2;
	static final int FIRST_CLASS = 1;
	FlightChargesMultithreading obj = new FlightChargesMultithreading();
	public void run() {
		obj.testFn(category);
		//FlightChargesMultithreading.testFn(category);
	}
	
	private int category = 0;
	
	 public FlightCategoriesMultithreading(int parameter) {
	       // store parameter for later user
		 this.category = parameter;
		// System.out.println(parameter);
	   }

	public static void main(String[] args) {
		System.out.println("===== Application Running =====");

		try {

			Runnable r1 = new FlightCategoriesMultithreading(100);
			//.start();
			Thread thread1 = new Thread(r1);
			thread1.start();
			//thread1.join();
			//int value = foo.getValue();
			System.out.println("FlightChargesMultithreading.commonAmount -->" + FlightChargesMultithreading.commonAmount);
			
			Runnable r2 = new FlightCategoriesMultithreading(200);
			//new Thread(r2).start();
			Thread thread2 = new Thread(r2);
			thread2.start();
			//thread2.join();
			System.out.println("FlightChargesMultithreading.commonAmount -->" + FlightChargesMultithreading.commonAmount);
			
			Runnable r3 = new FlightCategoriesMultithreading(300);
			//new Thread(r3).start();
			Thread thread3 = new Thread(r3);
			thread3.start();
			//thread3.join();
			System.out.println("FlightChargesMultithreading.commonAmount -->" + FlightChargesMultithreading.commonAmount);
			
			/*new Thread( new FlightCategoriesMultithreading() ).start();
			new Thread( new FlightCategoriesMultithreading() ).start();
			new Thread( new FlightCategoriesMultithreading() ).start();
	*/
			
			///r.join();
			//System.out.println("FlightChargesMultithreading.commonAmount -->" + FlightChargesMultithreading.commonAmount);

		} catch (Exception e) {
			System.out.println("Encountered error " + e.getMessage());
		}
		
		//System.out.println(FlightChargesMultithreading.commonAmount);
	}
}

class FlightChargesMultithreading {

	private int category = 0;
	private double charges = 0;
	
	FlightChargesMultithreading(){
		
	}

	public FlightChargesMultithreading(int category) {
		this.category = category;
	}

	public double getCharges() {
		return charges;
	}

	private void setCharges(double charges) {
		this.charges = charges;
	}
	static int commonAmount = 2000;
	
	/*private static double commonAmount = 2000.00;
	


	public double getCommonAmount() {
		return commonAmount;
	}

	public void setCommonAmount(double commonAmount) {
		this.commonAmount = commonAmount;
	}*/


	static synchronized void testFn(int category){
		try {
			//System.out.println(category);
		///	setCommonAmount(commonAmount - getCharges());
			//System.out.println("First class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
			commonAmount = commonAmount-category;
			System.out.println("commonAmount -->" + commonAmount);
		
			
			//setCommonAmount(commonAmount - getCharges());
			//System.out.println("Business class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
		//	System.out.println("commonAmount -->" + commonAmount);
			
			
			//setCommonAmount(commonAmount - getCharges());
			//System.out.println("Economy class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
		//	System.out.println("commonAmount -->" + commonAmount);
			
			

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
	}
	
	
/*	synchronized void testFn(int category){
		try {
			switch (category) {
			case 1:
				setCharges(500.0);
				//commonAmount = commonAmount - 500.0;
				setCommonAmount(commonAmount - getCharges());
				System.out.println("First class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
				System.out.println("commonAmount -->" + commonAmount);
				break;

			case 2:
				setCharges(250.0);
				//commonAmount = commonAmount - 250.0;
				setCommonAmount(commonAmount - getCharges());
				System.out.println("Business class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
				System.out.println("commonAmount -->" + commonAmount);
				break;

			case 3:
				setCharges(150.0);
				//commonAmount = commonAmount - 150.0;
				setCommonAmount(commonAmount - getCharges());
				System.out.println("Economy class charges are " + getCharges() + ",  commonAmount -->" + getCommonAmount());
				System.out.println("commonAmount -->" + commonAmount);
				break;
			}
			
			
			

		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
	}*/
}