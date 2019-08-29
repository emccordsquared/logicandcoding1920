public class Operators {
	public static void main(String[] args) {
		boolean p, q;  //declares two variables to be of type boolean
		int a, b;  //declares to variables to be of type integer
		double x, y;  //declares to variables to be of type double
		String arith_header, compare_header;  //create two string variables
		String str1 = new String("Upper");  //create two string OBJECTS
		String str2 = new String("Upper");

		//ASSIGN (=) values to the variables
		a = 3;
		b = 2;
		x = 3.0;
		y = 2.0;
		arith_header = "Results of Arithmetic Operations";
		compare_header = "Results of Comparison Operations";

		//Perform some ARITHMETIC operations on the data
		System.out.println( arith_header );
		System.out.println("a + b =\t" + (a + b) + "\tx + y =\t" + (x + y));
		System.out.println("a - b =\t" + (a - b) + "\tx + y =\t" + (x - y));
		System.out.println("a * b =\t" + (a * b) + "\tx + y =\t" + (x * y));
		System.out.println("a / b =\t" + (a / b) + "\tx + y =\t" + (x / y));
		System.out.println("a % b =\t" + (a % b) + "\tx + y =\t" + (x % y));

		//Perform some COMPARISON operations on the data
		System.out.println( "\n" + compare_header );
		System.out.println( "a < b\t" + (a < b) );
		System.out.println( "a <= b\t" + (a <= b) );
		System.out.println( "a > b\t" + (a > b) );
		System.out.println( "a >= b\t" + (a >= b) );
		System.out.println( "a != b\t" + (a != b) );
		System.out.println("str1 == str2\t" + (str1 == str2));
		System.out.println("str1.equals(str2)" + str1.equals(str2));
	}  //end main
} //end class Operators
