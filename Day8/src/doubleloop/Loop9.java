package doubleloop;

public class Loop9 {//diamond pattern

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=5;i++) {
			for (int k=5;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=rows-1;i++) {
			for (int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=rows-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

	}


