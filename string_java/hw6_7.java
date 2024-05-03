/*    
    Write a Java program that takes a string as input and determines whether the string qualifies as 
    a strong password. A strong password is defined by the following criteria:

  a. The password must be at least 8 characters long.
  b. The password must contain characters at least one - 
  c. Uppercase letters (A-Z)
  d. Lowercase letters (a-z)
  e. Digits (0-9)
  f. Special characters (e.g., !, @, #, $, etc.)
   Print ‘True’ if the password is strong, and ‘False’ otherwise. You may consider any character 
   excluding the alphabet, digit, and space as special characters
*/

import java.util.Scanner;
public class hw6_7 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password: ");
    String pass = sc.nextLine();
    
    int UpperCase = 0;
    int LowerCase = 0;
    int Digit = 0;
    int SpecialChar = 0;
    
    if (pass.length() >= 8) {
      for (int i = 0; i < pass.length(); i++) {
        char ch = pass.charAt(i);
        int ascii = (int) ch;
        if (ascii >= 65 && ascii <= 90) {
          UpperCase++;
        } else if (ascii >= 97 && ascii <= 122) {
          LowerCase++;
        } else if (ascii >= 48 && ascii <= 57) {
          Digit++;
        } else if (ascii >= 32 && ascii <= 47) {
          SpecialChar++;
        }
      } 
      if (UpperCase >= 1 && LowerCase >= 1 && Digit >= 1 && SpecialChar >= 1) {
        System.out.println("true");
      }
    } else {
      System.out.println("false");
    }
    
    sc.close ();
  }
}
