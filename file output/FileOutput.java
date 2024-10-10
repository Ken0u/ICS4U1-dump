/** 
   File Name: FileOutput.java
   Name: I. Lam
   Class: ICS3U1
   Date: December 9, 2018
   Description: This program writes output to a file.  It makes use of BufferedWriter
   and methods: write, newLine, close
*/

import java.io.*;

public class FileOutput {
   public static void main (String[] args) {
      try {
         BufferedWriter out = new BufferedWriter (new FileWriter("output.txt", true));
      	
         out.write("Hello");
         out.newLine();
         out.write("How are you?");
         out.newLine();
         out.close();
      } catch (IOException iox) {
         System.out.println("Problem accessing file.");
      }
   }
}