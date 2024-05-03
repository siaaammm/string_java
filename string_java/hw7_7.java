/*
    Write a Java program that will take two Strings as user 
    input and print the number of times the 
    second String occurs in the first String.
*/

import java.util.Scanner;
public class hw7_7 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String str1 = sc.nextLine();
    System.out.print("Enter the second string: ");
    String str2 = sc.nextLine();
    int occurrences = 0;
    
    for (int i = 0; i <= str1.length() - 1; i++) {
      boolean found = true;
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i + j) != str2.charAt(j)) {
          found = false;
          break;
        }
      }
      if (found) {
        occurrences++;
      }
    }
    System.out.println("occurs: " + occurrences + " times");
    
    sc.close();
  }
}
