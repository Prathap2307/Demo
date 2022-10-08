package hashCodeLearn;

class Employee {
	   private String name;
	   private int age;
	   Employee(String name, int age){
	      this.name = name;
	      this.age = age;
	   }
	   public boolean equals(Object obj) {
	      if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Employee)) {
	         return false;
	      }
	      Employee emp = (Employee) obj;
	      return name.equals(emp.name)&& Integer.compare(age, emp.age) == 0;
	   }
	}
	public class EqualsExample {
	   public static void main(String[] args) {
	      Employee emp1 = new Employee("Jhon", 15);
	      Employee emp2 = new Employee("Jhon", 19);
	      //Comparing the two objects
	      boolean bool = emp1.equals(emp2);
	      System.out.println(bool);
	   }
	}