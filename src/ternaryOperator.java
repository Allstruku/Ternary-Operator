
public class ternaryOperator {
	public static void main(String[] args) {
		int b1 = (5 > 4) ? 50 : 40 ;
		// for ternary operators, if the condition is true, the value on the left of the colon will be inserted into the
		// variable b1. However if the condition is false, the value of the right of the colon will be inserted into the 
		// variable b1
		System.out.println(b1);
	
		// ternary operators act the same as conditional if statements
		int b2;
		if (5 > 4) {
			b2 = 50;
			System.out.println(b2);
		} else {
			b2 = 40;
			System.out.println(b2);
		}
	}
}