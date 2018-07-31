import java.util.Scanner;

public class Objective3Lab5 {
    public static void main( String [] args) {
      double a, b, sum;

      Scanner input = new Scanner(System.in);

      System.out.print( " Plese enter a number ");
      a = input.nextDouble();

      System.out.print( " Enter another number ");
      b = input.nextDouble();

      sum = a + b;

      System.out.println( " The sum of " + a + " + " + b + " is = " + sum);

      input.close();
    }
}
