/* 
    Write a Java program that takes two strings (lowercase) as user input. Your task is to concat 
    the two strings except the common characters present in the strings. Then print the modified  
    string (uppercase). You can assume that each string will only contain unique characters; that 
    means there will be no duplicate characters in a particular string.
*/

import java.util.Scanner;
public class hw3_7 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter first string: ");
    String str1 = sc.nextLine ();
    System.out.print ("enter second string: ");
    String str2 = sc.nextLine ();
    int count1 = 0;
    int count2 = 0;
    
    for (int i = 0; i <= str1.length ()-1; i++) {
      char ch1 = str1.charAt (i);
      for (int j = 0; j <= str2.length ()-1; j++) {
        char ch2 = str2.charAt (j);
        if (ch1 == ch2)  {
          count1++;
        }
      }
      if (count1 == 0) {
        int ascii = (int) (str1.charAt (i) - 32);
        System.out.printf ("%c", ascii);
      }
      count1 = 0;
    }
    
    for (int i = 0; i <= str2.length ()-1; i++) {
      char ch1 = str2.charAt (i);
      for (int j = 0; j <= str1.length ()-1; j++) {
        char ch2 = str1.charAt (j);
        if (ch1 == ch2) {
          count2++;
        }
      }
      if (count2 == 0) {
        int ascii = (int) (str2.charAt (i) - 32);
        System.out.printf ("%c", ascii);
      }
      count2 = 0;
    }
    sc.close ();
  }
}
