import java.util.Scanner;

public class Objective4Lab4 {
    public static void main( String [] args ) {
      Scanner scan = new Scanner(System.in);
      int num;

      System.out.print("Enter a number: ");
      num = scan.nextInt();

      if ( num % 2 == 0 ) {
        System.out.println( "Your number is even!");
      }
      else {
        System.out.println( "Your number is odd!");
      }
    }
}
