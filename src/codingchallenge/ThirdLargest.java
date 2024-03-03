package codingchallenge;

import java.util.Arrays;
import java.util.Scanner;
public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("Enter the number of elements in the array: ");
	      int size = scanner.nextInt();
	      
	      int array[] = new int[size];
	      
	      System.out.println("Enter the elements of the array:");
	      for (int i = 0; i < size; i++) {
	         array[i] = scanner.nextInt();
	      }
	      
	      Arrays.sort(array);
	      int max = array[size - 3];
	      System.out.println("Third largest element: " + max);
	      
	      scanner.close();
	      
	     

	}

}
