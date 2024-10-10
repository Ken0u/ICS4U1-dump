public class Quiz {
    public static void main(String[] args) {
      int[] arr = {13, 20, 31, 43, 45, 46, 49, 70, 75, 83, 93, 100, 101, 110, 124};
      
      System.out.print(exponentialSearch(arr, 110));
      String a = "q45fgs";
      a += "q43tqrj";
    }
    
    public static int exponentialSearch(int[] list, int searchFor) {
      int expFactor = 1;
      int minBound = 0;
      int maxBound = 0;
      boolean minBoundFound = false;
      boolean maxBoundFound = false;
      
      while (!minBoundFound && !maxBoundFound) {
         minBound = expFactor - 1;
         maxBound = expFactor - 1;
         
         if (2 * (minBound + 1) - 1 >= list.length) {
            minBoundFound = true;
         }
         else if (list[minBound] <= searchFor && list[2 * (minBound + 1) - 1] > searchFor) {
            minBoundFound = true;
         }
         if (maxBound >= list.length) {
            maxBound = list.length - 1;
            maxBoundFound = true;
         }
         else if (list[maxBound] >= searchFor && list[(maxBound + 1) / 2 - 1] < searchFor) {
            maxBoundFound = true;
         }
         
         expFactor *= 2;
         
         System.out.println(minBound);
      System.out.println(maxBound);
      }
      
      
      while (minBound <= maxBound) {
         int middle = (minBound + maxBound) / 2;
         
         if (list[middle] == searchFor) {
            return middle;
         }
         else if (list[middle] > searchFor) {
            minBound = middle + 1;
         }
         else {
            maxBound = middle - 1;
         }
      }
      return -1;
    }
}