public class CreatingVariables {
    public static void main( String [] args ){
        int x, y, age, size;
        double seconds, e, checking, weight;
        String firstName, lastName, title, wrestler;

        x = 10;
        y = 400;
        age = 39;
        size = 100;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        weight = 255.45;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr. ";
        wrestler = " El Macho";

        System.out.println( "The variable x contains " + x);
        System.out.println( "The value " + y + " is stored in the variable y.");
        System.out.println( "The experiment took " + seconds + " seconds.");
        System.out.println( "A farvorite irrational # is Euler's numer: " + e);
        System.out.println( "Hopfully you have more than $" + checking + "!");
        System.out.println( "My name's " + title + " " + firstName + lastName);
        System.out.println( "The biggest wrestler is " + wrestler + ", he weighs " + weight + "lbs and is the size of " + size + " chipmunks");
    }
}
