package array;

public class main2 {

	public static void main(String[] args) {
		
		// 2D array = an array of arrays
		
		String[][] cars =   { 
				               {"Dodge","Jeep","BMW"},
				               {"Benz","Corvette","Ferrari"},
				               {"Lambo","Honda","Tesla"}
			};
		
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars.length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			
		}

	}

}
