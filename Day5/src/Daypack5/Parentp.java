package Daypack5;

public class Parentp{

	public Parentp () 
	{
		this(1,2);
		System.out.println("Parent default ");
	}
	public  Parentp(int a) {
		

		this(1,2,3);
		System.out.println("Parent1  parameterised");
	}
	public  Parentp(int a ,int b) 
	{
		this(1);
		System.out.println("Parent2  parameterised");
		
		}
	public  Parentp(int a ,int b,int c) 
	{
		
	System.out.println("Parent3 parameterised");
	}


}
