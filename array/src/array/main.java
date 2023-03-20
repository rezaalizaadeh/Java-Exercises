package array;

public class main {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = new String [3];
		
		cars[0] = "Dodge";
		cars[1] = "Mustang";
		cars[2] = "Tesla";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		

	}

}
