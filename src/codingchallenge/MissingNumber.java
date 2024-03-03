package codingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
	public static void main(String[] args) {

        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);

        List<Integer> listB = Arrays.asList(2, 4, 6, 10, 12, 14, 16, 18, 20);

        List<Integer> listC = Arrays.asList(1, 3, 5, 9, 11, 13, 15, 17);

        System.out.println("Missing number in List A: " + findMissingNumber(listA));

        System.out.println("Missing number in List B: " + findMissingNumber(listB));

        System.out.println("Missing number in List C: " + findMissingNumber(listC));

    }

    public static List<Integer> findMissingNumber(List<Integer> list) {

        List<Integer> missing = new ArrayList<>();

        int a = list.get(1) - list.get(0);

        int b = list.get(list.size() - 1) - list.get(list.size() - 2);

        int incrementor = a < b ? a : b;

        for (int i = list.get(0); i < list.get(list.size() - 1); i += incrementor) {

            if (!list.contains(i)) {

                missing.add(i);

            }

        }

        return missing;

 

    }
}
