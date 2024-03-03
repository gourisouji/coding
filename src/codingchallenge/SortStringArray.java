package codingchallenge;
import java.util.Arrays;
import java.util.Scanner;
public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Original array: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("Sorted array: " + Arrays.toString(names));
	}
}
