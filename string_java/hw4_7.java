/*   
   Write a Java program that takes a sentence as user input and displays the sentence in 
    aLtErNaTiNg CaPs format. Note that, you have to ignore spaces and other punctuations while  
    altering the characters. Also, your new sentence will always start with lowercase letters. 
*/

import java.util.Scanner;
public class hw4_7 {
  public static void main(String[] args) {
    
    System.out.println("Enter an output");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    
    String str = name.toLowerCase ();
    char word = ' ';
    
    for (int index = 0; index <= str.length ()-1; index++) { 
      char ch = str.charAt (index); 
      if (ch == ' ') {
        continue;
      } else if (index % 2 != 0) { 
        int ascii = (int) ch - 32;
        word = (char) ascii; 
      } else {
        word = ch;
      }
      System.out.print (word);
    }
    
    sc.close ();
  }
}