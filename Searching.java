/** 
	File Name: Searching.java
	Name: Ken Ou
	Class: ICS4U1
	Date: Feb 29, 2024
	Description: This program demonstrates the use of different search algs
*/

public class Searching {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int target = 4;
      
      sequentialSearch(arr, target);
      binarySearch(arr, target);
   }
   
   public static int sequentialSearch(int[] array, int target) {     
      for (int i = 0; i < array.length; i++) {
         if (array[i] == target) {
            return i;
         }
      }
      return -1;
   }
   
   public static int binarySearch(int[] array, int target) {
      int middle;
      int bottom = 0;
      int top = array.length - 1;
      
      while (bottom <= top) {
         middle = (bottom + top) / 2; 
         
         if (array[middle] == target) {
            return middle;
         }
         else if (array[middle] > target) {
            bottom = middle + 1;
         } 
         else {
            top = middle - 1;
         }
      }
      return -1;
   }
}