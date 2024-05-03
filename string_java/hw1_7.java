/*
  Write a Java program that takes a string as input and reverses the order of words in it.
*/

import java.util.Scanner;
public class hw1_7 {
  public static void main(String[] args) {
    
    System.out.println("Enter an output");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    String word = "" ;
    String f_word = "" ;
    
    for(int i = 0; i<str.length(); i++) {
      if (str.charAt(i) ==' ') {
        f_word = word + str.charAt(i) + f_word;
        word = "";
      } else {
        word = word + str.charAt(i);
      }
    }
    
    if (word.length() != 0) {
      f_word = word + " " + f_word;
      System.out.print(f_word);
    }   
    
    sc.close ();
  }
}
