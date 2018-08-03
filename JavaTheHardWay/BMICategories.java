import java.util.Scanner;

public class BMICategories {
    public static void main( String [] args ) {
      Scanner keyboard = new Scanner(System.in);
      double bmi, kg, m, lbs, inches, ft;

      System.out.print( " Enter your height (feet only): ");
      ft = (keyboard.nextDouble() * 12);
      System.out.print( "Enter your height ( inches only): ");
      inches = keyboard.nextDouble();

      m = ( ft + inches ) * .0254;

      System.out.print( "Enter weight in lbs: ");
      lbs = keyboard.nextDouble();

      kg = lbs * .453592;

      bmi = kg / (m * m);


      System.out.println( "Your bmi is : " + bmi);

      System.out.print( "BMI category: ");
      if ( bmi < 15.0 ) {
        System.out.println( "very severely underweight" );
      }
      else if ( bmi <= 16.0 ) {
        System.out.println( "severely underweight");
      }
      else if ( bmi < 18.5 ) {
        System.out.println( "underweight");
      }
      else if ( bmi < 25.0 ) {
        System.out.println( "normal weight");
      }
      else if ( bmi < 30.0 ) {
        System.out.println( "overweight");
      }
      else if ( bmi < 35.0 ) {
        System.out.println( "moderately obese");
      }
      else if ( bmi < 40.0 ) {
        System.out.println( "severly obese");
      }
      else {
        System.out.println( "very severely \"morbidly\" obese");
      }
    }
}
