package java_code_jan_10th_2023;

public class Static_nonstatic {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		
		leftTriangle();
		righTriangle();
		leftbuttomTriangle ();
		rightbottomTriangle();
		test();
		
		Static_nonstatic nonstatic = new Static_nonstatic();
		
		nonstatic.test1();
		nonstatic.test2();
		nonstatic.test3();
		nonstatic.test4();
		nonstatic.test5();
		
	}
	
	public static void leftTriangle() {
		System.out.println("1");
		
	} 
	
	public static void righTriangle() {
		System.out.println("2");
		
	}
    public static void leftbuttomTriangle () {
		System.out.println("3");
    }
    public static void rightbottomTriangle() {
		System.out.println("4");
	} 
    public static void test() {
		System.out.println("5");
		
	}
    
	
	void test1() {
		System.out.println("6");
		
	}
    void test2() {
		System.out.println("7");
    	
    }
    void test3() {		System.out.println("8");
		
	}
     void test4() {		System.out.println("9");
	
    }
    void test5() {		System.out.println("10");
	
    }
    
    
}
