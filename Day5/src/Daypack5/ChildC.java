package Daypack5;

public class ChildC extends Parentp {
	public ChildC() 
	{
		this(1,2,3);
		System.out.println("class  default parameterised");
	}
	public  ChildC(int a) {
		

		this();
		System.out.println("class1  parameterised");
	}
	public  ChildC(int a ,int b) 
	{
		super();
		System.out.println("class2  parameterised");
		
		}
	public  ChildC(int a ,int b,int c) 
	{
		this(1,2);
	System.out.println("class3 parameterised");
	}
public static void main(String[] args) {
	ChildC bb = new ChildC(1);
		}

	

}
