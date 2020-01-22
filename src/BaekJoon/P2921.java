package BaekJoon;

public class P2921 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),r=0,a=3,b;
		for(;n-->0;b=r,r+=(a+b),a+=3);
		System.out.print(r);
	}

}
