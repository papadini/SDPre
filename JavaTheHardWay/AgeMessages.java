import java.util.Scanner;

public class AgeMessages {
    public static void main( String [] args) {

      Scanner keyboard = new Scanner(System.in);
      int age;

      System.out.print( "How old are you? ");
      age = keyboard.nextInt();

      System.out.println( "You are: ");
      if ( age < 13) {
        System.out.println( "\ttoo young to create a facebook account");
      }
      if ( age >= 13 ) {
          System.out.println( "\told enough for facebook!");
      }
      if ( age < 16) {
        System.out.println( "\ttoo young to get a drivers license" );
      }
      if ( age >= 16 ) {
          System.out.println( "\t old enough to drive!");
      }
      if ( age < 18 ) {
        System.out.println( "\ttoo young to get a tatoo");
      }
      if ( age >= 18 ) {
          System.out.println( "\told enough for a tatoo!");
      }
      if ( age < 21 ) {
        System.out.println( "\ttoo young to drink alcohol");
      }
      if ( age >= 21 ) {
          System.out.println( "\told enough to drink!");
      }
      if ( age < 35 ) {
        System.out.println( "\ttoo young to run for President" );
        System.out.println( "\t\t(How Sad!)");
      }
      if ( age >= 35 && age < 65) {
          System.out.println( "\tyou can run for President");
      }
      if ( age >= 65 ) {
        System.out.println("\tYour old enough to retire!");
      }
    }
}
