/*
  Write a Java program that splits a given string on a given split character. 
  The first input is a String and the second input is the character t
  hat will be used to split the first String.
*/

import java.util.Scanner;
public class cw3_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the string: ");
    String name = sc.nextLine ();
    System.out.print ("enter the char: ");
    String split = sc.next ();
    
    for (int i = 0; i < name.length (); i++) {
      char j = name.charAt (i);
      String s=String.valueOf(j);
      if (split.equals(s)) {
        System.out.println();
      } else {
        System.out.print (j);
      }
    }

    sc.close ();
  }
}
