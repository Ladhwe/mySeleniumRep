interface printable1{  
void print();  
}  
class InterfaceEx1 implements printable1{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
	InterfaceEx1 obj = new InterfaceEx1();  
obj.print();  
 }  
}  
