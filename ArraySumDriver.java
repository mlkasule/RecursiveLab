public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		ArraySum arraySum = new ArraySum();

		myArray[index++] = 3;
		myArray[index++] = 5;
		myArray[index++] = 2;
		myArray[index++] = 6;
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		//a = {3,5,2,6,7,1};
		/*
		 * Test with 0
		 */
		int sum = arraySum.sumOfArray(myArray, 1);
		System.out.println("Sum at 1 = " + sum);


		sum = arraySum.sumOfArray(myArray, 3);
		System.out.println("Sum at 3 = " + sum);
		
		sum = arraySum.sumOfArray(myArray, 5);
		System.out.println("Sum at 5 = " + sum);
	}

}