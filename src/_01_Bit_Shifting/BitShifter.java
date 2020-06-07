package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		String binaryStr="";
		        	int num = 4;

        do {
    		int numShifted = num >> 1;
		// 2. Print the value of numShifted, and convert that value to binary.
            System.out.println(numShifted);
            
            if( num % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            num = numShifted;
            
        // 3. Repeat until number is 0
        } while( num != 0 );
        
        System.out.println(binaryStr); 
    }
		// 3. Compare the two binary values. Can you figure out what the << operator is
		// for?

		// 4. Try shifting num 3 places.

		// FYI: Binary values can be shifted to the right as well using the >> operator.

	}

