package codingchallenge; 
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms for fibonacci series:");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a + " ");
			int x=a+b;
			a=b;
			b=x;
		}
		sc.close();

	}

}