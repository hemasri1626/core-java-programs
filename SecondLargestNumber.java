package week1.assignment;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(data);

		System.out.println("The second largest number: " + data[(data.length) - 2]);

	}
}
