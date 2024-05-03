/*
  Write a Java program that has a given string and prints a
   compressed version of the 
   string by counting the consecutive occurrences of each character.
*/

import java.util.Scanner;
public class hw2_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter the string: ");
    String str = sc.nextLine ();
    
    String all = "" ;
    int count = 0;
    
    for (int i = 0; i <= str.length ()-1;) { 
      char ch = str.charAt (i); 
      for (int j = i; j <= str.length ()-1; j++){ 
        if (ch == str.charAt (j) ) { 
          i++; 
          count++; 
        } else {
          break;
        }
      }
      
      all = all + ch + count; 
      count = 0;
    }
    System.out.println (all); 
    
    sc.close ();
  }
}
