/** 
	File Name: StringPermutation.java
	Name: ken ou
	Class: ICS4U1
	Date: March 25, 2024
	Description: This program permutes a string
*/

import java.util.*;

public class StringPermutation {
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      
      String input = sc.nextLine();
      permute(input);
      System.out.println();
      permuteNoDuplicate(input, "");
   }
   
   public static void permute(String s) {
      permute(s, "");
   }
   
   public static void permute(String s, String soFar) {
      if (s.equals("")) {
         System.out.println(soFar);
      }
      else {
         for (int i = 0; i < s.length(); i++) {
            permute(s.substring(0, i) + s.substring(i + 1), soFar + s.charAt(i));
         }
      }
   }
   
   public static void permuteNoDuplicate(String s, String soFar) {
      if (s.equals("")) {
         System.out.println(soFar);
      }
      else {
         for (int i = 0; i < s.length(); i++) {
            permute(s.substring(0, i) + s.substring(i + 1), soFar + s.charAt(i));
         }
      }
   }
}