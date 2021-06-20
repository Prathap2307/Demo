package poltmorphism;

/*public class Programizmain {

}
*/
class Polygon {

	// method to render a shape
	//renderPolygon
	public void renderPolygon() {
		System.out.println("Rendering Polygon...");
	}
	
	
	  public void render() { System.out.println("TESTING TYPE"); }
	 
}

class Square extends Polygon {

	// renders Square
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon {

	// renders circle
	public void render() {
		System.out.println("Rendering Circle...");
	}
}

class Programizmain {
	public static void main(String[] args) {

		// create an object of Square
		Square s1 = new Square();
		s1.render();
		

		// create an object of Circle
		Circle c1 = new Circle();
		c1.render();
		
		Polygon p1 = new Circle();
		p1.renderPolygon();
		
	}
}