import java.util.Locale;

public class MyPoint2D {

	private double x;
	private double y;
	
	public MyPoint2D(double aX, double aY) {
		x = aX;
		y = aY;
	}
		public double getDistanceFrom(MyPoint2D q) {
			double d2 = (x - q.x) * (x - q.x) +(y - q.y)*(y - q.y);
			return Math.sqrt(d2);
		}
		public MyPoint2D getMidpoint(MyPoint2D q) {
			double xm = (x + q.x) / 2;
			double ym = (y + q.y) / 2;
			MyPoint2D tmp = new MyPoint2D(xm , ym);
			
			return tmp;
		}
		public String toString() {
			return String.format(Locale.US, "MyPoint2D(%.2f , %.2f)", x,y);
		}
		public boolean isCoincident(MyPoint2D q) {
			return approxEquals(x, q.x) && approxEquals(y, q.y);
		}
		private static boolean approxEquals(double a, double b) {
		final double EPSILON = 1E-14;
		return Math.abs(a - b ) <= EPSILON * Math.max(Math.abs(a), Math.abs(b));
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}
		



