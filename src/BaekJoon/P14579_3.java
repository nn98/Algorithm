package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;
//±¦È÷ ÂÌÇÊ¿ä°¡ ¾ø´Ù
public class P14579_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=1001,a[]=new int[i],j=1;
		for(;j<i;a[j]=j+a[j-1],j++);
		long r=1;
		for(;n<=m;r*=a[n++],r%=14579);
		System.out.print(r);
	}
}