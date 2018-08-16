import java.util.Scanner;

public class Objective6Lab5 {
  public static void main( String [] args ) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while ( true ) {
      System.out.println("---Menu---");
      System.out.println("1: Say Hello");
      System.out.println("2: List favorite foods");
      System.out.println("3: exit");
      System.out.println("Make a selection");

      selection = scanner.nextInt();

      if (selection == 1 ) {
        System.out.println( selection);
        System.out.println("Hello World!");
      }
      else if ( selection == 2 ) {
        System.out.println( selection);
        System.out.println(" Apples, Pizza, Pie");
      }
      else if ( selection == 3 ) {
          System.out.println( selection);
          System.out.println("Goodbye");
          break;
      }
      else
      System.out.println( "Enter 1,2 or 3 only");
    }
    scanner.close();

  }
}
