package BaekJoon;

public class P14491 {
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),m=6561;
		String r="";
		while(m>0) {
			r+=n/m;
			n%=m;
			m/=9;
		}
		System.out.print(r);
	}
}
