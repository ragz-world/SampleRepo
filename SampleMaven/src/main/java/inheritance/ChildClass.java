package inheritance;

public class ChildClass extends SingleParent {
	
public void display()

{
   System.out.println("hello");	
}

public static void main(String[] args) {
	
	ChildClass obj =new ChildClass();
	obj.print();
	obj.display();
	
}

}
