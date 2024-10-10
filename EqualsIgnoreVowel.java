/** 
	File Name: EqualsIgnoreVowel.java
	Name: ken ou
	Class: ICS4U1
	Date: March 26, 2024
	Description: This program does stuff
*/

import java.util.*;

public class EqualsIgnoreVowel {
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      
      System.out.print(equalsIgnoreVowel(s1, s2));
   }
   
   public static boolean equalsIgnoreVowel(String s1, String s2) {
      if (s1.length() == 0 && s2.length() == 0) {
         return true;
      }
      else if (s1.length() == 0) {
         return equalsIgnoreVowel("a", s2);
      }
      else if (s2.length() == 0) {
         return equalsIgnoreVowel(s1, "a");
      }
      
      String vowels = "aeiouAEIOU";
      int c1Vowel = 0;
      int c2Vowel = 0;
      
      for (int i = 0; i < vowels.length() && c1Vowel == 0 && c2Vowel == 0; i++) {
         if (s1.charAt(s1.length() - 1) == vowels.charAt(i)) {
            c1Vowel = 1;
         }
         if (s2.charAt(s2.length() - 1) == vowels.charAt(i)) {
            c2Vowel = 1;
         }
      }
      
      if (c1Vowel == 0 && c2Vowel == 0) {
         return (s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1)) && equalsIgnoreVowel(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1));
      }
      else {
         return equalsIgnoreVowel(s1.substring(0, s1.length() - c1Vowel), s2.substring(0, s2.length() - c2Vowel));
      }
   }
}