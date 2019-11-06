
abstract class Car {
	//constructor
	Car() { 
		System.out.println("This is a constructor");
	}
	//static method
	static void testCar() { 
		System.out.println("this is static method");
		
	}
	
	//declaration of the method
	abstract void color(); 
	//declaration of method
	abstract void manufactYear();
	//defination or implemenation of the method
	void model() { 
		System.out.println("Here we are implementing method");
	}

	
}
class Honda7 extends Car { 
	void color() { 
		System.out.println("This is a color method implementaion");
		
	}
	void manufactYear() {
		System.out.println("This is manufacturing year");
				
	}
	public static void main(String args[]) { 
		Honda7 obj = new Honda7();
		obj.color();
		obj.manufactYear();
		Honda7.testCar();
		
	}
	
}
