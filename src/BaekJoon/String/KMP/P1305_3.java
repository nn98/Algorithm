package BaekJoon.String.KMP;

import java.util.Arrays;
import java.util.Scanner;

public class P1305_3 {

	static int n,i,j,b[],r=0;
	static char[]a;
	static void o() {
		b=new int[n];
		for(;++i<n;) {
//			while(j>0&a[i]!=a[j])j=b[j];	pi�迭�� j-1.
			while(j>0&a[i]!=a[j])j=b[j-1];
			if(a[i]==a[j]) {
				b[i]=++j;
			}
			r=r>b[i]?r:b[i];
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=s.next().toCharArray();
		o();
		System.out.println(Arrays.toString(b));
//		pi ���ϰ� 
//		System.out.print(n-r); x
		System.out.print(n-b[n-1]); // o
//		??
//		�ִ밪�� �ƴ϶� �Ĺ̰�??
	}

}
