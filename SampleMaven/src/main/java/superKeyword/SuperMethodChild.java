package superKeyword;

public class SuperMethodChild extends SuperMethodParent  {
	
	public void display()
	
	{
		super.show();
		System.out.println("World");
		
	}

	public static void main(String[] args) {
	
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();
		

	}

}
