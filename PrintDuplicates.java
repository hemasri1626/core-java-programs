package week1.assignment;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int arrSize = arr.length;
		
		// declare an int variable named count
		int count;
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int j=0; j < arrSize-1; j++) {
			
			// assign 0 to count 
			count = 0;
				// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
				for(int i=j+1; i < arrSize ; i++ ) {
					// compare both the loop variables & check they're equal
						// increase the count if both the arrays are equal
						if(arr[i] == arr[j]) {
							count++;
						}
				}
				// Out of the inner loop, check and print the first array variable if count is more than 0
				if(count > 0) {
					System.out.println("Duplicated values:"+ arr[j]);
				}
						
		}
		
	}

}
