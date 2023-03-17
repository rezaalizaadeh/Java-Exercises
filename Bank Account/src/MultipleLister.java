import java.util.Scanner;
public class MultipleLister
{
 public static void main(String[] args)
 {
	 final int NUMBR_PER_LINE = 5;
	 
	 System.out.println(" Prints the list of multiples of p in the interval [min, max]. ");
	 System.out.println("p min & max are integers entered from standard input. ");
	 

	 
	 Scanner in = new Scanner(System.in);
	 System.out.print("enter p min max: ");
	 int p=in.nextInt();
	 int min=in.nextInt();
	 int max=in.nextInt();
	 in.close();
	 
	 System.out.println("Multiple of"+p+"in the interval["+ min+","+max+"]");
	 
	 int i = min;
	 while(i<=max) {
		 if ((i%p)==0) 
		 System.out.print(i+" ");	 
		 i++;
	 }
	 	System.out.println(i);
 }
}