interface example1 { 
	void method4();
}
interface example2 { 
	void method5();
}
interface example3 {
	void method6();
}
public class TestIntf1 implements example1,example2,example3{
public void method4() { 
	System.out.println("This is a method 4");
}
public void method5() { 
	System.out.println("This is a method 4");
}
public void method6() { 
	System.out.println("This is a method 4");
}

public static void main(String args[]) { 
	TestIntf1 ex1 = new TestIntf1();
	ex1.method4();
	ex1.method5();
	ex1.method6();
}

}
