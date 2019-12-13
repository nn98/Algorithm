package BaekJoon;

import java.util.Scanner;

public class P11944 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		String N=""+n;
		m=m<N.length()*n?m:N.length()*n;
		StringBuffer b=new StringBuffer();
		while(b.length()<m)
			b.append(N);
		System.out.print(b.substring(0,m));
	}
}