package staticLearnPackage;

public class FinalStaticLearn {
	
	
		final static int count = 0; 

		public void	FinalStaticLearn() {
		//	count++; 
			System.out.println(count);
		}

		public static void main(String args[]) {
			//creating objects  
			FinalStaticLearn c1 = new FinalStaticLearn();
			System.out.println("c1.count -->"  + c1.count);
			FinalStaticLearn c2 = new FinalStaticLearn();
			FinalStaticLearn c3 = new FinalStaticLearn();
		}


}
