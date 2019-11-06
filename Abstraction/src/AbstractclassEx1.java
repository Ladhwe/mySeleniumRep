abstract class Bike5{  
  abstract void run();  
}  
public class AbstractclassEx1 extends Bike5{
	void run(){
		System.out.println("running safely");
		}
	public static void main(String args[]){  
		 Bike5 obj = new AbstractclassEx1();  
		 obj.run();  
		}  
	

}
