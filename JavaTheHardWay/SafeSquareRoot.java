import java.util.Scanner;

public class SafeSquareRoot {
    public static void main( String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x,y;
        String ready;


        System.out.print("Give me a number, and ill find its square root. ");
        System.out.println( "(No negatives please.) ");
        System.out.println(" are you readuy? (yes or no) ");
        ready = keyboard.next();

        while ( !ready.equals("yes")) {
          System.out.println( "Take a mnmuite and think about it, then reenter answer");
          ready = keyboard.next();
        }
        System.out.print("Great! enter a number: ");
        x = keyboard.nextInt();

        while (x < 0 ) {
        System.out.println( "I wont take the square root of a negative.");
        System.out.print("\nNew number: ");
        x = keyboard.nextInt();
      }
      y = Math.sqrt(x);

      System.out.println( "The square root of " + x + " is " + y);
    }
}
