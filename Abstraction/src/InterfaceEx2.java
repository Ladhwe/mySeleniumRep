//Java Interface Example: Drawable
//In this example, the Drawable interface has only one method. 
//Its implementation is provided by Rectangle and Circle classes. In a real scenario, 
//an interface is defined by someone else, but its implementation is provided by different implementation providers. Moreover, it is used by someone else. The implementation part is hidden by the user who uses the interface.
//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  
class InterfaceEx2{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  