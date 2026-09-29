package exceptionHandling;

public class Example {


	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try 
		{
			
		int c = a/b;
		
		}
		
		catch(ArithmeticException x) 
		{
		 
		b = 2;
		int c = a/b;
		System.out.println(c);
		System.out.println(x);
		
		}
		
		
		finally
		{
			System.out.println("hello");
			
		}
		
		//System.out.println(c);
		
	}

}
