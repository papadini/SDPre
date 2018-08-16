public class Objective6Lab3 {
    public static void main( String [] args ) {
      int counter = 0;

      while (counter <= 20 ) {

        if ((counter % 2) == 0 ) {
          System.out.println(counter + " is EVEN");
          counter ++;
        }
        else {
          System.out.println( counter + " is ODD");
          counter++;
        }
      }
    }
}
