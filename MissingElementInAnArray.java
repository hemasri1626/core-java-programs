package week1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			if (i + 1 == arr[i]) {
				// System.out.println("Number exists");
			} else {
				System.out.println("Number doesn't exists and the missing number is: " + (i + 1));
				break;
			}
		}

	}

}
