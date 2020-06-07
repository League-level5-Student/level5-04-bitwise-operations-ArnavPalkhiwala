package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		String binaryStr="";
		String sNum = Byte.toString(b);
		int num = Integer.parseInt(sNum);
	       do {
	   		int numShifted =num >> 1;
	           
	           if( num % 2 != 0 ){
	               binaryStr = '1' + binaryStr;
	           } else {
	               binaryStr = '0' + binaryStr;
	           }
	           
	           num = numShifted;
	           
	       } while( num != 0 );
	       
	       System.out.println(binaryStr); 	}
	
	public void printShortBinary(short s) {
		String binaryStr="";
		String sNum = Short.toString(s);
		int num = Integer.parseInt(sNum);
	       do {
	   		int numShifted =num >> 1;
	           
	           if( num % 2 != 0 ){
	               binaryStr = '1' + binaryStr;
	           } else {
	               binaryStr = '0' + binaryStr;
	           }
	           
	           num = numShifted;
	           
	       } while( num != 0 );
	       
	       System.out.println(binaryStr); 	
	   }
		
	
	
	
	public void printIntBinary(int i) {
		String binaryStr="";
	       do {
	   		int numShifted =i >> 1;
	           
	           if( i % 2 != 0 ){
	               binaryStr = '1' + binaryStr;
	           } else {
	               binaryStr = '0' + binaryStr;
	           }
	           
	           i = numShifted;
	           
	       } while( i != 0 );
	       
	       System.out.println(binaryStr); 
	   }
		
	
	
	public void printLongBinary(long l) {
		String binaryStr="";
		String sNum = Long.toString(l);
		int num = Integer.parseInt(sNum);
	       do {
	   		int numShifted =num >> 1;
	           
	           if( num % 2 != 0 ){
	               binaryStr = '1' + binaryStr;
	           } else {
	               binaryStr = '0' + binaryStr;
	           }
	           
	           num = numShifted;
	           
	       } while( num != 0 );
	       
	       System.out.println(binaryStr); 	

	}
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary((byte) 10);
		bp.printShortBinary((short) 10);
		bp.printIntBinary(10);
		bp.printLongBinary((long) 10);
		}
}
