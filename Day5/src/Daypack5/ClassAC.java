package Daypack5;

public class ClassAC {
	
	public ClassAC() 
	{
		this(1,2);
		System.out.println("Parent default parameterised");
	}
	public ClassAC (int a) 
	{
		this();
		System.out.println("Parent1 parameterised");
	}
	public ClassAC (int a ,int b) 
	{
		
		System.out.println("Parent2 parameterised");
	}
	public ClassAC (int a ,int b,int c) 
	{
		this(1);
		System.out.println("Parent3  parameterised");
	}
	

}
