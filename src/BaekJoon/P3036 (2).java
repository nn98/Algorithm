import java.util.Scanner;

public class P3036 {

	static int GCD(int a,int b) {
		while(b!=0) {
			int t=a%b;
			a=b;
			b=t;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n],a=s.nextInt();
		for(int i=1;i<n;i++) {
			int b=s.nextInt();
			int r=a>b?GCD(a,b):GCD(b,a);
			System.out.println(a/r+"/"+b/r);
		}
	}
}
