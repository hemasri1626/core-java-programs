package week1.day2.homework;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test = "changeme";

		char[] testCharArr = test.toCharArray();

		for (int i = 0; i < testCharArr.length; i++) {
			if (i % 2 == 1) {
				char ch = testCharArr[i];
				System.out.println(Character.toUpperCase(ch));
			}
		}
	}
}