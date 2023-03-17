import java.util.Scanner;
public class main
{
 public static void main(String[] args)
 {
 final int NUMBERS_PER_LINE = 10;
 Scanner in = new Scanner(System.in);

 System.out.println();
 System.out.println("****************************************************************");
 System.out.println("* Prints the list of multiples of p in the interval [min, max] *");
 System.out.println("* p min & max are integers entered from standard input *");
 System.out.println("****************************************************************\n");

 System.out.print("enter p, min e max: ");
 int p = in.nextInt();
 int min = in.nextInt();
 int max = in.nextInt();
 in.close();

 System.out.println("Multiples of " + p + " in the interval [" + min + ", " + max + "]:");
 
 int i = min;
 int j = 0;
 while (i <= max){
 if ((i % p) == 0){
 j++;
 if ((j % NUMBERS_PER_LINE) != 0)
 System.out.print(i + " ");
 else
 System.out.println(i);
 }
 i++;
 }

 System.out.println(); 
 }
}