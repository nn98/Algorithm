package BaekJoon;

public class P10162 {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		System.out.print(n%10==0?n/300+" "+n%300/60+" "+n%60/10:-1);
	}
}