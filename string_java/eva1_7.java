/*
  Write a JAVA program that will take one string input from the user.
  Then prints the string in reverse
*/

import java.util.Scanner;
public class eva1_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the string: ");
    String name = sc.nextLine ();
    
    for (int i = name.length ()-1; i >= 0; i--) {
      System.out.print (name.charAt (i));
    }
    
    sc.close ();
  }
}

