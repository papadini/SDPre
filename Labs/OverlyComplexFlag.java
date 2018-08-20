public class OverlyComplexFlag {
    public static void main( String [] args ) {
      printTopHalf();

      print48Colons();
      print480hs();
      print48Colons();
      print480hs();
      print48Colons();
      print480hs();
      printPledge();
    }

    public static void print48Colons() {
      System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
    }

    public static void print480hs() {
      System.out.println("|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|");
    }

    public static void print29Colons() {
      System.out.println("|::::::::::::::::::::::::::::::|");
    }

    public static void printPledge() {
      System.out.println("I pledge allegiance to the flag.");
    }
    public static void print29Ohs() {
      System.out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
    }

    public static void print6Stars() {
      System.out.print("|*  *  *  *  *  * ");
    }

    public static void print5Stars() {
      System.out.print("|  *  *  *  *  *  ");
    }

    public static void printSixStarLine() {
      print6Stars();
      print29Ohs();
}

    public static void printFiveStarLine() {
      print5Stars();
      print29Colons();
 }

 public static void printTopHalf() {
   System.out.println( " ________________________________________________" );
 // the line above has 1 space then 48 underscores between the quotes
  printSixStarLine();
  printFiveStarLine();
  printSixStarLine();
  printFiveStarLine();
  printSixStarLine();
  printFiveStarLine();
  printSixStarLine();
}
}
