package Daypack5;

  public class ClassB extends ClassA {
		
		public void mm5() {
			
			System.out.println("child default constructor");
			this.mm6(1);  //this key can use after syso in case of methhod but not in case of constructor ,In constructor it should always first syso
		}
		public void mm6(int a) {
			System.out.println("child 1 Paremeterized constructor");
			this.mm7(1, 2);
		}
		public void mm7(int a ,int b) {
			
			System.out.println("child 2 Paremeterized constructor");
			}
		   public void  mm8(int a,int b,int c) {
			super.mm3(1,2);
			System.out.println("child 3 Paremeterized constructor");
			this.mm5();
			}
         public static void main(String[] args)  {
		  ClassB pp =new  ClassB();
			pp.mm8(1, 3, 4);
			
			
			
			
		}

	}

