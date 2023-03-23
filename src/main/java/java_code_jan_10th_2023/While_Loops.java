package java_code_jan_10th_2023;


public class While_Loops {

	public static void main(String[] args) {
		
		//2-- the addition of the first 10 intergers from 1 t0 10 
		
//		int i = 1;
//		int sum = 0;
//		 while (i<=10) {
//			 sum = sum + i;
//			 System.out.println(i);
//			 i++;
//			
//		 }
//		 System.out.println(sum);
		
	

//	int i=1;
//	while (i <=100) { System.out.println(i++);}
	
	 

//-------------------------------FIRST PROGRAM-----------------------------------------
		
 // 3--print first 100 multiples of 5	

//		int i = 1;
//      while (i <= 100){
//   	System.out.println(i*5);
//   	i++;
//		}

      
//-------------------------------SECOND PROGRAM-----------------------------------------

		// 4-- print first 20 multiples of 10 and add the multiples
		
//		 int i = 1;
//		 int sum = 0;
//		 
//	    while (i <= 20){ 
//	    	
//	   	System.out.println(i*10);
//	   	 sum = sum + i*10 ;
//	   	i++;
//	       } 
//	    
//	    System.out.println(sum);
		
		
///////////////////////////////////////////////////////////
//		int sum = 0;
//		for(int i=1 ; i<=20 ; i++) {
//			System.out.println(i*5);
//			sum = sum + (i*5);
//			System.out.println("the sum at each iteration is : " + sum);
//		}
//		
//		System.out.println("the sum is : " + sum);		
	   
		
		
//---------------------------------------THIRD PROGRAM -----------------------------
	// 5-- print 20 multiples of 5 in decreasing order starting from 250	
		
//		int i = 250;
//		 int j = 0;
//	    
//		while (j <= 20) {
//		System.out.println(i);
//		i= i-5; // i-=5;
//	    j++;
//	    
//		}
		
//-----------------------------------------FOURTH PROGRAM ---------------------------
		
		
		//6-- print 20 multiples of 5 in decreasing order starting from 250 and add
		
		
//		int i = 250;
//		int j = 20;
//		int sum = 0;
//	    
//		while (i <= 250) {
//		System.out.println(i);
//		i= i-5;                         // i-=5;
//		sum = sum + (i-5);
//	    j--;
//	    if (j==0) {break;}
//			
//		}
//		System.out.println("the sum is " + sum);
		
//-----------------------------------------------------------------------------------		
		//6-- print 20 multiples of 5 in decreasing order starting from 250 and add
		
//		int value = 250;
//		int limit = 0;
//		int sum = 0;
//		
//	while (limit < 20) {
//		System.out.println(value);
//		value = value - 5;
//		sum = sum + (value -5);
//		limit++;		
//	}
//	System.out.println(sum);
		
//------------------------------------------------------------------------------------------------------

	//	5 -- Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
		
		
			int i = 7;
			int j = 0;
			
			while (j <= 10) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
		
		
//*************************************************************************************************************
	
	// 8-- 30 multiples of 9 in decreasing order
//	    	starting point is 999
//		   add only the even multiples		
		
//		int value = 999;
//		int limit = 0;
//		int sum = 0;
//		
//		 while (limit <= 30) {
//			 System.out.println( value);
//			 value = value - 9;
//			 
//			 if(value % 2 ==0) {
//				 sum = sum + value;
//				 System.out.println("the sum of the previous even numbers = " + sum);
//			 } 
//			 limit++;
//		 }
//     System.out.println( "The total sum is "+ sum);
////		
     
//**************************************** for loop *******************************************

		//Print Hello World 10 times using for loop
//		 for(int i=1; i<=10 ; i++) {
//	    	  System.out.println("Hello World");
//	    	 
//	      }
		
		
//********************************************************************	
		

		
		
//**********************************************************************************		
	
		//         int sum = 0;
//      for (int i = 1; i <= 20; i++) {
//    	  System.out.println(i * 5);
//    	  sum = sum + (i *5);
//      }
//      System.out.println("the sum " + sum);
     
//***************************************************************************************
		
//		for (int i = 20; i >= 0; i-=2) {
//			System.out.println(i);
//	}
		
		

//		   int a = 20;
//		
//		for (int i = 1; i <= 11 ; i++) {
//			System.out.println(a);
//			a = a-2;
//			}
		
//********************************************************************************************************
		
//		for (int i =1; i <= 5; i++) {    // otter for loop is for the rows  
//			for (int j = 1; j <= 5 ; j++) {      // inner for loop represents columns
//				System.out.print(" $ ");
//				
//			}
//			System.out.println();
//		}

//*********************************************************************************************************

//		*
//		**
//		***
//		****
//		*****
//		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i ; j++) {      
//				System.out.print(" * ");
//			
//		}
//			System.out.println();
//		}
//*******************************************************************************************************
		
//		*****
//		****
//		***
//		**
//		*
//    
//		for (int i = 1; i <= 5; i++) {   
//			for (int j = 5; j >= i ; j--) {      
//		System.out.print(" * ");	
//		
//			}
//			System.out.println();
//		}
		
//*********************************************************************************************************
		
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 
//		 *  *  *  * 
//		 *  *  * 
//		 *  * 
//		 * 
//		
//		for (int i = 1; i <= 5; i++) {  
//			
//			for (int j = 1; j <= i ; j++) {      
//				System.out.print(" * ");
//			}
//			System.out.println();
//			
//			
//		}
//		
//		for (int i = 2; i <= 5; i++) { 
//			
//			for (int j = 5; j >= i ; j--) {      
//				System.out.print(" * ");
//			
//		}
//			System.out.println();
//			
//		}
		

		
	
		
		
		
//**********************************************************************************************************
		
//	         *
//         * *
//       * * *
//     * * * *
//   * * * * *
		
		
//		
//		for (int i = 1; i <= 5 ; i++ ) {
//			for ( int j = i ; j <= 5; j++) {
//				  System.out.print("  ");
//				}
//			for ( int j = 1 ; j <= i ;j++ ) {
//				System.out.print(" *");
//			}
//			
//			
//			System.out.println();
//		}
//************************************************************************************
		
		
//		 *****
//		  ****
//		   ***
//		    **
//		     *
		     
//		for (int i =1 ; i <= 5; i++) {
//			for (int j = 1 ; j <= i; j++) {
//				System.out.print("  ");
//			}
//			
//			for (int j = 5; j >=i; j--) {
//				System.out.print(" *");
//			}
//
//			System.out.println();
//		}
	
//***********************************************************************************
		
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        *
		
//		for (int i =1 ; i <= 5 ; i++) {
//			
//			for (int j = 5 ; j >= i ; j--) {
//				System.out.print("  ");
//			}
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			
//		System.out.println();	
//		}
//		
//		for (int i = 2 ; i <= 5; i++) {
//			
//			for(int j = 1 ;  j <=i  ; j++ ) {
//				System.out.print("  ");
//			}
//			for (int j = 5 ; j >= i ; j--) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
	}
}



