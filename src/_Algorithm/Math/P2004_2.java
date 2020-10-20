package _Algorithm.Math;
import java.util.*;
public class P2004_2 {
	static long o(long n) {
		long m=0;
		for(long i=5;i<=n;i*=5)
			m+=n/i;
		return m;
	}
	static long p(long n) {
		long m=0;
		for(long i=2;i<=n;i*=2)
			m+=n/i;
		return m;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextInt(),m=s.nextInt();
		System.out.print(Math.min(o(n)-(o(m)+o(n-m)),p(n)-(p(m)+p(n-m))));
	}
}