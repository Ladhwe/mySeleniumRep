//Multiple Inheritance
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class InterfaceEx3 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	InterfaceEx3 obj = new InterfaceEx3();  
obj.print();  
obj.show();  
 }  
}  

