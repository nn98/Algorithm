package BaekJoon;

public class P18222_3 {
//https://sys09270883.github.io/ps/3/
//bit operation
	public static void main(String[] args) {
		long n=new java.util.Scanner(System.in).nextLong()-1,c=0;
		while(n>0) {
			c+=n&1;
			n>>=1;
		}
		System.out.println(c&1);
	}
}