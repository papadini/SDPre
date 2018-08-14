import java.util.Scanner;

public class EnterPin {
  public static void main( String [] args ) {
      Scanner keyboard = new Scanner(System.in);
      int pin, entry;
      String password, userWord;

      password= "baxterboy";
      pin = 12345;

      System.out.println( "WELCOME TO THE BANK OF JAVA");
      System.out.println( "WHAT IS YOUR PASSWORD: ");
      userWord = keyboard.next();

      while (!password.equals(userWord) ) {
        System.out.println("\nINCORRECT, TRY AGAIN");
        userWord = keyboard.next();
      }

      System.out.println( "NOW, ENTER YOUR PIN: ");
      entry = keyboard.nextInt();

      while ( entry != pin ) {
        System.out.println("\nINCORRECT PIN, TRY AGAIN");
        System.out.print( "ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
      }
      System.out.println( "\nPIN ACCEPTED, YOUR ACCOUNT BALANCE IS $425.17");
  }
}
