/** 
   File Name: ValidateInput.java
   Name: I. Lam
   Class: ICS4U1
   Date: September 20, 2022
   Description: This program makes use of Exceptions to
   validate the user input
*/

import java.util.*;

public class ValidatInput {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      boolean validInput = false;
      
      while (!validInput) {
         try {
            System.out.print("Enter an integer:  ");
            num = sc.nextInt();
            
            // will only reach this point when nextInt is successfully run
            validInput = true;
            System.out.println("You entered " + num);
         }  catch (InputMismatchException ime) {
            System.out.println("Invalid input");
            sc.nextLine();    // need to flush the Scanner
         }
      }
   
   }
}