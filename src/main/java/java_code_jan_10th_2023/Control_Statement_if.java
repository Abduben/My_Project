package java_code_jan_10th_2023;

public class Control_Statement_if {

	public static void main(String[] args) {
	/* int a = 10;
	 int b = 20;
	 int c = 30;*/
	 
		/*
		 * if (a>b && a>c) { System.out.println(a); }else if (b>c && b>a){
		 * System.out.println(); } else { System.out.println(c); }
		 */
		/*----------------------------------------------------------------------*/

		/*
		 * int a =100 ; int b=9;
		 * 
		 * if (a%2 == 0) { System.out.println("a is an even number" ); } else {
		 * System.out.println("a is not an even "); }
		 * 
		 * if (b%2 == 0) { System.out.println("a is an even number" ); } else {
		 * System.out.println("b is odd numner ");
		 * 
		 * 
		 * }
		 */
		/* ------------------------------------------------- */
	
	int year1= 1994;

	
	if ((year1 % 400 == 0) || ((year1 % 4==0)  && (year1 % 100 != 0 ))) {
		System.out.println(year1 + " is a leap year ");} else {System.out.println(year1 + "is not a leap year");}
	
	}}
