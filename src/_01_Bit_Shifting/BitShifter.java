package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 1;

		// 2. Print the value of numShifted, and convert that value to binary.

		String binary = "";

		System.out.println(numShifted);
		while (numShifted != 0) {

			int numShiftedTwo = numShifted >>> 1;
			if (numShifted % 2 != 0) {

				binary = '1' + binary;

			}

			else {
				binary = '0' + binary;
			}

			numShifted = numShiftedTwo;
		}
		
		System.out.println(binary);
		// 3. Compare the two binary values. Can you figure out what the << operator is
		// for?

		// 4. Try shifting num 3 places.

		// FYI: Binary values can be shifted to the right as well using the >> operator.
	}
}
