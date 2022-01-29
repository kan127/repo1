package doubleloop;

import java.util.Scanner;

public class Loop10 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the value");
		
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			for (int k=5;k>=i;k--) {
				System.out.print(" ");
		}
			for(int j=1;j<=i;j++) {
				if (j==1 || j==i || i==a)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	}

}
}