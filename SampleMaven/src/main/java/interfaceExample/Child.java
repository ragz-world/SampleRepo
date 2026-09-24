package interfaceExample;

public class Child implements Parent {
	
	public void show()
	
	{
		System.out.println("hai");
		
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
		obj.print();
		obj.show();  
		
		//interface name objectname = new classname();
		
		Parent obj1 =new Child();
		obj1.display();
		obj1.print();
		
		
	}
 
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("world");
		
	}

}
