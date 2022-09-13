package FlightTiketBookDemo;

public class FlightCategories {
	 static final int FIRST_CLASS = 1;
	    static final int BUSINESS_CLASS = 2;
	    static final int ECONOMY_CLASS = 3;

	    public static void main(String[] args){
	        System.out.println("===== Application Running =====");

	        try {

	            FlightCharges firstClass = new FlightCharges(FIRST_CLASS);
	            firstClass.computeFlightCharges();

	            FlightCharges businessClass = new FlightCharges(BUSINESS_CLASS);
	            businessClass.computeFlightCharges();

	            FlightCharges economyClass = new FlightCharges(ECONOMY_CLASS);
	            economyClass.computeFlightCharges();

	            System.out.println("First class charges are "+firstClass.getCharges());
	            System.out.println("Business class charges are "+businessClass.getCharges());
	            System.out.println("Economy class charges are "+economyClass.getCharges());

	        } catch (Exception e){
	            System.out.println("Encountered error "+e.getMessage());
	        }
	    }
	}
 class FlightCharges {

	    private int category = 0;
	    private double charges = 0;

	    public FlightCharges(int category) {
	        this.category = category;
	    }

	    public double getCharges() {
	        return charges;
	    }

	    private void setCharges(double charges) {
	        this.charges = charges;
	    }

	    public void computeFlightCharges(){
	        try {
	            switch (category){
	                case 1:
	                    setCharges(500.0);
	                    break;

	                case 2:
	                    setCharges(250.0);
	                    break;

	                case 3:
	                    setCharges(150.0);
	                    break;
	            }

	        } catch (Exception e){
	            System.out.println("Exception "+e.getMessage());
	        }
	    }
}
