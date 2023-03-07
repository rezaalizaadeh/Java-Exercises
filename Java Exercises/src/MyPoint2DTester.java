import java.util.Scanner;
import java.util.Locale;

public class MyPoint2DTester {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		in.useLocale(Locale.US);
		System.out.println("Enter x1 e y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
	
		System.out.println("Enter x2 e y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		
	    in.close();
	
	
	    MyPoint2D p = new MyPoint2D(x1, y1);
	    MyPoint2D r = new MyPoint2D(x2, y2);
	
	    System.out.println("p1 : " + p);
	    System.out.println("p2 : " + p);
	    
	   
	    System.out.println("The distance between point " + p + "and point " + r + " is "+p.getDistanceFrom(r));
	    System.out.println("The middlepoint between point " + p + "and point " + r + " is "+p.getMidpoint(r));
	
	
	
	
	
	
	
	}
}