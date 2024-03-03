package codingchallenge;

import java.util.Scanner;

public class OccurrenceOfLetter {
	public static void main(String[] args)
	{
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");

		String name = sc.nextLine();

		System.out.println("Enter the letter");

		char ch = sc.next().charAt(0);

		for (int i = 0; i < name.length(); i++)

		{
			if (name.charAt(i) == ch)

			{
				count = count + 1;
			}
		}
		sc.close();

		System.out.println("Occurence of" + " " + ch + " is " + count);
	}
}
