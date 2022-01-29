package Daypack5;

public class ClassA {
	public void mm1() {
		this.mm4(1, 2, 3);
		System.out.println("parent  default constructor");
	    }
	public  void mm2(int a) {
		this.mm1();
		System.out.println("parent  1 Paremeterized constructor");
	}
	public void mm3(int a ,int b) {
		this.mm2(1);
		System.out.println("parent  2 Paremeterized constructor");
		}
	  public void  mm4(int a,int b,int c) {
		System.out.println("parent 3 Paremeterized constructor");
	}

	
		}





