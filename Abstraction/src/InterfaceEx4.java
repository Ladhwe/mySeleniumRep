//Interface inheritance
//A class implements an interface, but one interface extends another interface.
interface Printable2{  
void print();  
}  
interface Showable2 extends Printable2{  
void show();  
}  
class InterfaceEx4 implements Showable2{  
public void print(){System.out.println("Hello22");}  
public void show(){System.out.println("Welcome22");}  
  
public static void main(String args[]){  
	InterfaceEx4 obj = new InterfaceEx4();  
obj.print();  
obj.show();  
 }  
}  

