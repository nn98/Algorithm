package BaekJoon;
import java.util.Scanner;

public class P5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		while(!(a==0&&b==0)) {
			if(a%b==0) System.out.println("multiple");
			else if(b%a==0) System.out.println("factor");
			else System.out.println("neither");
			a=s.nextInt();
			b=s.nextInt();
		}
	}
}