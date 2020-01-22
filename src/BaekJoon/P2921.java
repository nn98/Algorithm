package BaekJoon;

public class P2921 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),r=0,a=3,b=0;
		for(;n-->0;b=a+b,r+=b,a+=3);
		System.out.print(r);
	}
}