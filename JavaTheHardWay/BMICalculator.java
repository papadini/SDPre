import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, lbs, ft, inches;


        System.out.print( "Your height in feet(only): ");
        ft = keyboard.nextDouble();


        System.out.print( "Your height in inches? ");
        inches = keyboard.nextDouble ();
        m = ((ft * 12) + inches )* .0254;

        System.out.print( "your weight in lbs: ");
        lbs = keyboard.nextDouble();
        kg = lbs * .453;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi);

    }
}
