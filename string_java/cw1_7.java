/*
  Write a Java program that will take a String as input 
  and convert the lowercase letters to the  uppercase letters. 
  The program should keep the other characters 
*/

import java.util.Scanner;
public class cw1_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the string: ");
    String name = sc.nextLine ();
    String cap = name.toUpperCase ();
    System.out.print (cap);
    
    sc.close ();
  }
}
