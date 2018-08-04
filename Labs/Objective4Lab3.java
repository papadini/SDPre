import java.util.Scanner;

public class Objective4Lab3 {
  public static void main( String [] args ) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.print( "Please enter a number: ");
    userNum = scanner.nextInt();

    if ( userNum < 0 ) {
      System.out.println( "Your number is negative!");
    }
    else if ( userNum == 0) {
        System.out.println( " Your number is equal to 0!");
      }

    else if ( userNum > 0 ) {
        System.out.println( "Your number is positive!");
      }

    scanner.close();
  }
}
