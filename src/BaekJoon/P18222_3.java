package BaekJoon;

public class P18222_3 {

	public static void main(String[] args) {
		long n=new java.util.Scanner(System.in).nextLong()-1,c=0;
		while(n>0) {
//			System.out.println(n&1);
			c+=n&1;
//			System.out.println(n);
			n>>=1;
//			System.out.println(n);
		}
//		System.out.println(c);
		System.out.println(c&1);
	}
}