package superKeyword;

public class SuperVariableChild extends SuperVariableParent{
	
	String name = "Ramachandran";
	
	public void print()
	
	{
		System.out.println(super.name);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();

	}

}
