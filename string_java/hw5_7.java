/*
    Write a Java program to remove duplicate characters from a given string that appeared in  
    another given string. 
*/

import java.util.Scanner;

public class hw5_7 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("enter first string: ");
    String str = sc.nextLine ();
    String str1 = str.toLowerCase();
    System.out.print ("enter second string: ");
    String str2 = sc.nextLine ();
    String a = str1;
    String b = "";
    
    for (int i = 0; i <= str2.length ()-1; i++) {
      char ch1 = str2.charAt (i);
      for (int j = 0; j <= a.length ()-1; j++) {
        char ch2 = a.charAt (j);
        if (ch1 == ch2)  {
          continue;
        } else {
          b = b + ch2;
        }
      }
      a = b;
      if (i == str2.length()-1) {
        continue;
      } else {
        b = "";
      }
    }
    System.out.println (b);
    
    sc.close();
  }
}
