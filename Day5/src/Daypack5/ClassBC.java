package Daypack5;

public class ClassBC extends ClassAC{
	
	public ClassBC() 
	{
		this(1,2);
		System.out.println("class  default parameterised");
	}
	public ClassBC(int a) {
		

		this(1,2,3);
		System.out.println("class1  parameterised");
	}
	public ClassBC(int a ,int b) 
	{
		this(1);
		System.out.println("class2  parameterised");
		
		}
	public ClassBC(int a ,int b,int c) 
	{
	super(1,2,3);
	System.out.println("class3 parameterised");
	}
public static void main(String[] args) {
	ClassBC bb =new ClassBC();
		}

}
