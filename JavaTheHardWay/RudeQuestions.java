import java.util.Scanner;

public class RudeQuestions {
    public static void main( String [] args ){
      String name;
      int age, siblings;
      double weight, income;

      Scanner keyboard = new Scanner(System.in);

      System.out.print( "Hellow. What is your name? ");
      name = keyboard.next();

      System.out.print( "Hi, " + name + "! How old are you? ");
      age = keyboard.nextInt();

      System.out.println( "So you're " + age + ", eh? Thats not very old. ");
      System.out.print( "how much do you weigh, " + name + "? ");
      weight = keyboard.nextDouble();

      System.out.println( weight + "! Better keep that quiet!!");
      System.out.print( "Finally, whats your income, " + name + "?");
      income = keyboard.nextDouble();

      System.out.print( "Hopefully that is " + income + " per hour" );
      System.out.println( " and not per year!");
      System.out.print( "well, thanks for answering my rude questions, ");
      System.out.println( name + ".");

      System.out.print( "How many siblings do you have? ");
      siblings = keyboard.nextInt();

      System.out.println( " Only " + siblings + "!, I have four!");



    }
}
