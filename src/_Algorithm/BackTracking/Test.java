package _Algorithm.BackTracking;

public class Test {

	static int n;
	static char[]a;
	static StringBuffer f=new StringBuffer();
	static void o(int x) {
		if(x==n)System.out.println(a);
		else {
			for(int i=0;++i<n;a[x]=(char)('0'+i),o(x+1));
		}
	}
	public static void main(String[] args) {
		n=new java.util.Scanner(System.in).nextInt()+1;
		a=new char[n];
		o(0);
		System.out.println(f);
	}

}
