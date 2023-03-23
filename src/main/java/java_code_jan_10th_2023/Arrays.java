package java_code_jan_10th_2023;

public class Arrays {

	public static void main(String[] args) {
 
/*	    String[][]a =  {{"Abdu","Kewan"}, 
	    		       {"1234", "Class"},
	    		       {"URU","#hANDS UP"}
	    		       };
	    
	    
	    for (int i =0; i <a.length; i++ ) {
	    	
	    	for (int j = 0 ; j <a[i].length; j++) {
	    		
	    		System.out.print(a[i][j] + " ");
	    	}
	    	
	    	System.out.println();*/
//	    }
	    
	    // String is a non primitive data type a
	    // string is a class
	    // String i scalled array of characters or  a sequence of characters
	    // string is immutable meaning that they cannot be changed 
	    // various ways to create string objects: string, stringBuilder, stringbuffer
	    
	    //memory spaces
	    //heap area   scp /slp is inside heap area only 
	    //stack area
	    //method area
	    // pc register
	    //native method area
	    
	    
	    // which key is used to cretae Object
	    // the moment new keyword  is used to create an Object, the object occupies memory space in Heap area
	    
	  //  String s1 =new String(); // 1 object created in heap area
	    
	    
	    //String s2 =new String("java"); // 2 objects got created
	                                    // teh object  created by new keyword will go in heap area
	                                    // the literal  created will act as another object and it will be directly inside the SLP/SCP
	                                       // SLP = STIRNG LITERAL POOL  // scp = String Constent pool
	                                     // jvm internal 
	    
	    
	    
	    //String s3 = "a"; // one object created    and the reason why we choose String s1 because of memory 
	    //String s5 =new String("stay"); // two objects created
	   //the reason why we choose String s1 because of memory. THE SECOND ONE WILL OCCUPY TWICE THE memory. 
	    
	    // character don't allow to retrival
	    // password should always be saved in character array
	    
	    
	    
	    
	    String A = "Abdu";
	    String B = "Sam";
	  
	    System.out.println(A.replace(B, A));
	    
	    
	    
	    
	    
	    
	    
	}

}
