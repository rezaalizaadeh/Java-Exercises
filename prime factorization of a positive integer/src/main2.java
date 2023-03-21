import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		
	      System.out.println(" compute the decomposition of a positive ");
	      System.out.println(" integer in prime factors ");
	      System.out.println("");

	      System.out.print("n?: ");
	      
	      // opens the input data flow
	      Scanner in = new Scanner(System.in);
	      
	      // reads the integer from the input data flow
	      int n = in.nextInt();
	      
	      // closes the input data flow
	      in.close();

	      // management of the invalid case n <= 0
	      if (n <= 0)
	      {
	         System.out.println(n + ": invalid integer");
	         return;
	      }

	      // Factorization
	      String s = "1";          // string to store progressively the factors
	      int k = n;               // variable to avoid changing variable n 
	      int j = 2;               // loop control variable
	      while (j * j <= k) 
	      {
	         while (k % j == 0)    // untill the integer k can be divided by j
	         {
	            s = s + " * " + j; // concatenates the divider on the right
	            k = k / j;         // the new number to be factorized is k / j
	         }
	         j++;                  // loop control variable increment
	      }

	      if (k > 1)               // if k is greater than 1, then k is a divider
	         s += " * " + k;

	      // printing of the factorization on standard output
	      System.out.println(n + "+" + s);

	}

}
