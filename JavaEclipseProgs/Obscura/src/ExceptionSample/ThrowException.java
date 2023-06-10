package ExceptionSample;

public class ThrowException {

	public static void testThrow(int age) {
		if (age<18) {
		//	System.out.println("Not Eligible for Vote");
			throw new ArithmeticException("Not Eligible");
		} else {
			System.out.println("Eligible for vote");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.testThrow(21); // Static method didnot requires creating object.

	}

}
