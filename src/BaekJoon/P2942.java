package BaekJoon;
import java.util.Scanner;
public class P2942 {
	static int g(int a,int b) {
		int t;
		if(a>b) {
			t=a;
			a=b;
			b=t;
		}
		while(a!=0) {
			t=b%a;
			b=a;
			a=t;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int R=s.nextInt(),G=s.nextInt(),m=g(R,G),i=0;
		while(i++<=m)
			if(m%i==0)
				System.out.println(i+" "+R/i+" "+G/i);
	}
}