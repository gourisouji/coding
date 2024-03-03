package codingchallenge;

import java.util.Arrays;

public class SumOfTwo {
	public static int[] sumoftwo(int arr1[], int target) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i] + arr1[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		int[] arr = {3,4,6,2};
		int target = 9;
		int[] res = sumoftwo(arr , target);
		if(res != null) {
			System.out.println(Arrays.toString(res));
		}
		else {
			System.out.println("No solution found");
		}
		

	}

}
