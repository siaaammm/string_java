/*
  Write a Java program to check if a string is palindrome or not. 
  A string is palindrome if the reverse of the string is the same 
  as the original string. 
*/

import java.util.Scanner;
public class cw2_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the string: ");
    String str = sc.nextLine ();
    
    for (int i = 0; i <= str.length()-1; i++) {
      if (str.charAt (i) != str.charAt (str.length ()-1-i)) {
        System.out.print ("false");
      } else {
        System.out.print ("true");
      }
      break;
    }
    
    sc.close ();
  }
}
