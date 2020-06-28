package BaekJoon;
//https://docu94.tistory.com/41

import java.util.Arrays;
import java.util.Scanner;

public class P2331 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long p,j,k=1,q,a[]=new long[100000];
		int i=0,x=0;
		a[i++]=s.nextInt();
		p=s.nextInt();
		loop:
		for(;i<20;i++) {
			q=0;
			j=a[i-1];
			for(k=1;k<=j;k*=10);
			for(;k>1;k/=10,q+=Math.pow(j/k,p),j%=k);
			System.out.println(" "+q);
			a[i]=q;
			for(x=0;x<i;x++)if(a[x]==a[i])break loop;
		}
//		System.out.println(Arrays.toString(a));
		System.out.println(x);
	}

}