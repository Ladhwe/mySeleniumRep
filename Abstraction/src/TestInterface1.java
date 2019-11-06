interface Reusable { 
	
	void method1();
	void method2();
	void method3();
}
public class TestInterface1 implements Reusable {
	public void method1() { 
		System.out.println("this is a method1 implementation");
	}
	public void method2() { 
		System.out.println("this is a method2 implementation");
	}
	public void method3() { 
		System.out.println("this is a method3 implementation");
	}
	
	public static void main(String args[]) { 
		//TestInterface1 test = new TestInterface1();
		Reusable test = new TestInterface1();
		test.method1();
		test.method2();
		test.method3();
	}
	

}
