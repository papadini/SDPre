import java.util.Scanner;

public class SecretWord {
    public static void main( String [] args) {
      Scanner keyboard = new Scanner(System.in);
      String secret = "please", guess;

      System.out.print( "Whats the secret word? ");
      guess = keyboard.next();

      if (guess.equals(secret) || guess.equals("poop")) {
        System.out.println( "THats correct!");
      }
      else {
          System.out.println( "No, the secret word isnt \"" + guess + "\".");
        }


    }
  }
