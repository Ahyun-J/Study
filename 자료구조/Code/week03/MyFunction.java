package week03;

public class MyFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[800000]; // create an array

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0; }// initialize

		long beforefConstant = System.currentTimeMillis(); // start the timer
		fConstant(arr); // wait until it returns
		long afterfConstant = System.currentTimeMillis(); // finish the timer
		
		long fConstantTime = afterfConstant - beforefConstant; // get the diff
		System.out.println("Time fConstant (ms): " + fConstantTime+"\n");

		///////////
		long beforefLinear = System.currentTimeMillis(); // start the timer
		fLinear(arr); // wait until it returns
		long afterfLinear = System.currentTimeMillis(); // finish the timer
		
		long fLinearTime = afterfLinear - beforefLinear; // get the diff
		System.out.println("Time fLinear (ms): " + fLinearTime+"\n");
		///////////
	
		///////////
		long beforefQuadratic = System.currentTimeMillis(); // start the timer
		fLinear(arr); // wait until it returns
		long afterfQuadratic = System.currentTimeMillis(); // finish the timer
		
		long fQuadraticTime = afterfQuadratic - beforefQuadratic; // get the diff
		System.out.println("Time fQuadratic (ms): " + fQuadraticTime+"\n");
		///////////
		
		///////////
		long beforefCubic = System.currentTimeMillis(); // start the timer
		fLinear(arr); // wait until it returns
		long afterfCubic = System.currentTimeMillis(); // finish the timer
		
		long fCubicTime = afterfCubic - beforefCubic; // get the diff
		System.out.println("Time fCubic (ms): " + fCubicTime+"\n");
		///////////
		
		///////////
		long beforefFourth = System.currentTimeMillis(); // start the timer
		fLinear(arr); // wait until it returns
		long afterfFourth = System.currentTimeMillis(); // finish the timer
		
		long fFourthTime = afterfFourth - beforefFourth; // get the diff
		System.out.println("Time fFourth (ms): " + fFourthTime+"\n");
		///////////
	}

	// O(1)
	public static void fConstant(int[] arr) {
		int result = 0;
		for (int i = 0; i <= 10000; i++) {
			result += i;
		}
	}

	// O(N)
	public static void fLinear(int[] arr) {
		int result = 0;
		for (int i = 0; i <= arr.length; i++) {
			result += i;
		}
	}

	// O(N^2)
	public static void fQuadratic(int[] arr) {
		int result = 0;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = arr.length; j >= 0; j--) {
				result += i;
			}
		}
	}

	// O(N^3)
	public static void fCubic(int[] arr) {
		int result = 0;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = arr.length; j >= 0; j--) {
				for (int k = 0; k <= arr.length; k += 2) {
					result += i;
				}
			}

		}
	}

	// O(N^4)
	public static void fFourth(int[] arr) {
		int result = 0;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = arr.length; j >= 0; j--) {
				for (int k = 0; k <= arr.length; k += 2) {
					for (int m = arr.length; m >= 0; m -= 2) {
						result += i;
					}
				}
			}

		}
	}
}
