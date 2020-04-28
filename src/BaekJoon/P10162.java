package BaekJoon;

public class P10162 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),r=0;
		r+=n/300;
		n%=300;
		r+=n/60;
		n%=60;
		r+=n/10;
		n%=10;
		System.out.print(r);
	}

}
