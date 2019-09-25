package BaekJoon;
import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=a-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
