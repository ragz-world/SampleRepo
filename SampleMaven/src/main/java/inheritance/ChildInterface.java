package inheritance;

public class ChildInterface implements multipleParent1,multipleParent2{
	
	

	public static void main(String[] args) {
		
		ChildInterface obj = new ChildInterface();
		obj.print();
		obj.show();

	}

	@Override
	public void show() {
		
		System.out.println("Aira");
		
	}

	@Override
	public void print() {
		
		System.out.println("Jaan");
		
	}

}
