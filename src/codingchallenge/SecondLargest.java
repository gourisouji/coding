package codingchallenge;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int size;
		int temp;
		System.out.println("Enter the size of an array");
		size = sc.nextInt();   
		int arr[] = new int[size];
																																												System.out.println("Enter the elements zof an array");
																																												for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) { 
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second largest element is " + arr[size - 2]);
		sc.close();
	}
}
