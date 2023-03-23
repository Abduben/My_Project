package java_code_jan_10th_2023;

public class Practice {

	public static void main(String[] args) {
		
		Practice Int = new Practice();
		
		Int.starts();
	

	}
	
	
	
	public void integers() {


		

//		*
//		**
//		***
//		****
//		*****
		
		for (int i= 1; i <=5; i++) {
			
			for (int j=1; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println("*");
		}

	}
	
	
//	       *
//       * *
//     * * *
//   * * * *
// * * * * *
	
	public void starts() {
		
		for (int i= 1; i <=5; i++) {
			
			
			for (int j =i ; j<=5; j++ ) {
				System.out.print("  ");
		}
			for (int a=1; a <= i ; a++ ) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}
	
	
}
