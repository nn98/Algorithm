package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16916_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
		BigInteger n=BigInteger.ZERO,m;
		int i=0,j,c=0;
		for(;i++<b.length;n=n.add(new BigInteger(""+i*b[i-1])));
		System.out.println(n);
		for(i=0;i<a.length-b.length&&c==0;i++) {
			m=BigInteger.ZERO;
			for(j=1;j<b.length;j++)
				m=m.add(new BigInteger(""+j*a[i+j-1]));
			System.out.println(m);
			if(n.equals(m))c++;
		}
		System.out.println(c);
	}

}
