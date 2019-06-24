package BaekJoon;
import java.util.Scanner;

public class B1110 {

	static int sol(int N) {
		int r=1,a=N%10*10+(N/10+N%10)%10;
		while(true) {
			if(a==N) break;
			r++;
			System.out.println(a);
			a=a%10*10+(a/10+a%10)%10;
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		System.out.print(sol(N));
	}

}
