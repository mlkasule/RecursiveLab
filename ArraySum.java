/*
 * A recursive method to sum the values in an array of integers. 
 * Create a file ArraySum.java and add the recursive method 
 * public int sumOfArray (Integer[] a,int index).
 * Note that ‘a’ is an array of type Integer that
 * is specified in the driver file, and ‘index’ is an integer that
 * shows which number in the array to sum next.  
 */
public class ArraySum {

	private int arrSum = 0; // sum accumulator

	/*
	 * no arg constructor
	 */
	public ArraySum() {
	}

	/*
	 * @param a array of integers.
	 * 
	 * @param index the index of the element in the array.
	 * 
	 * @return the sum of the array.
	 */
	public int sumOfArray(Integer[] a, int index) {

		// a = {3,5,2,6,7,1};

		if (index <= 0) {
			arrSum = 0; // base case
		} else {
			int previousElementIndex = (index - 1); // element on the right of current index

			arrSum = a[previousElementIndex] + sumOfArray(a, (previousElementIndex)); // reproduction
		}

		return arrSum;
	}

}
