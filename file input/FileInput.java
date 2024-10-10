/** 
   File Name: FileOutput.java
   Name: I. Lam
   Class: ICS3U1
   Date: December 9, 2018
   Description: This program read input from files. 
*/

   import java.io.*;

    public class FileInput{
       public static void main (String[] args) {
         try {
            BufferedReader in = new BufferedReader(new FileReader("data.txt"));
         
            String input;
            
				// reading each line from file data.txt and output to 
				// standard output
         	input = in.readLine(); 
            while (input != null) {
               System.out.println(input);
               input = in.readLine();
            }
            
				// Alternate way - most efficient
//          	while ((input = in.readLine()) != null) {
// 					System.out.println(input);
//          	}
    			in.close();
				     
			// read in a table from file "testMark.txt"
         // The first two lines indicates the number of rows and columns to follow
			 BufferedReader in = new BufferedReader(new FileReader("testMark.txt"));

         	int len, width;
				String[] temp;
				
				len = Integer.parseInt(in.readLine());
				width = Integer.parseInt(in.readLine());
				int[][] table = new int[len][width];
				
				for (int i = 0; i < len; i++) {
					temp = in.readLine().split(" ");
					for (int j = 0; j < width; j++) {
						table[i][j] = Integer.parseInt(temp[j]);
					}
				}
				in.close();
         } 
             catch (IOException iox) {
               System.out.println("Problem accessing file.");
            }
      }
   }