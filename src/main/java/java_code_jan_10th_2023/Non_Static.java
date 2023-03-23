package java_code_jan_10th_2023;

public class Non_Static {

	public static void main(String[] args) {
		
		Non_Static ad = new Non_Static();
		Non_Static sb = new Non_Static();
		Non_Static ml = new Non_Static();
		Non_Static dv = new Non_Static();
		
		System.out.println("the additon is " + ad.addition (10, 9));
		System.out.println("the subtraction" + sb.subtraction(10, 9));
		System.out.println("the multiplication " + ml.multiplication(10, 9));
		System.out.println("the division " + dv.division(20, 5));
		


	}
	
	public int addition(int a, int b) {
		int sum;
		sum = a+b;
		return sum;

	}
	
	public int subtraction (int a, int b) {
		int sub;
		sub = a-b;
		return sub;
		
	}
	
	public int multiplication(int a, int b) {
		int mul;
		mul = a*b;
		return mul;
	}
	
	public int division (int a, int b) {
		int div;
		div = a/b;
		return div;
	}

}
