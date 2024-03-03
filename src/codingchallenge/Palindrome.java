package codingchallenge;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		String s = sc.nextLine();

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)
			rev = rev + s.charAt(i);

		if (s.equals(rev))

			System.out.println(s + " is a palindrome");

		else

			System.out.println(s + " is not a palindrome");
		
		sc.close();
	}

}
