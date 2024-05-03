/*    
    Captain Jack and his crew have discovered a treasure chest full of gold coins. However, the 
    chest comes with a mysterious lock. To open it, they need to input a phrase that should contain 
    a combination of characters where vowel count is divisible by 3 and consonant count is 
    divisible by 5. Write a Java program to help Captain Jack determine if the input phrase has 
    the correct number of vowels and consonants to unlock the treasure chest.
*/

import java.util.Scanner;
public class eva2_7 {
  public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String name = sc.nextLine();
    
    int vow = 0;
    int con = 0;
    name = name.toLowerCase();
    
    for (int i = 0; i < name.length(); i++) {
      char ch = name.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vow++;
      } else {
        con++;
      }
    }
    
    if (vow % 3 == 0 && con % 5 == 0) {
      System.out.println("Aaarr! Me Plunder!!");
    } else {
      System.out.println("Blimey! No Plunder!!");
    }
    
    sc.close ();
  }
}
