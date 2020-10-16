package week1.day2.homework;

public class RemoveDuplicates {
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		int count;

		String[] strArr = text.split(" ");
		String newStr = "";

		for (int i = 0; i < strArr.length; i++) {
			count = 0;

			for (int j = 0; j < i; j++) {
				if (strArr[j].equalsIgnoreCase(strArr[i])) {
					count++;
				}

			}

			if (count > 0) {
				newStr = newStr + " " + strArr[i].replace(strArr[i], "");
			} else {
				newStr = newStr + " " + strArr[i];
			}

		}
		System.out.println(newStr);

	}

}