import java.util.Scanner;

public class P2609 {

	static int GCD(int a,int b) {
		while(b!=0) {
			int t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	static int LCM(int a,int b) {
		return a/GCD(a,b)*b/GCD(a,b)*GCD(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		int r=a>b?GCD(a,b):GCD(b,a);
		int t=a>b?LCM(a,b):LCM(b,a);
		System.out.println(r);
		System.out.println(t);
	}

}
