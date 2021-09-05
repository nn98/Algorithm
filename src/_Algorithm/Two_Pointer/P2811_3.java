package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P2811_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0,I=0,J,V=0,c,r=0,a[]=new int[n],b[]=new int[n];
		for(;i<n;i++) {
			a[i]=s.nextInt();
			if(a[i]<0) {
				I=j==0?i:I;
				j++;
				if(j>V) {
					V=j;
					J=I;
				}
			}else {
				for(j*=2;--I>=0&j-->0;b[I]++);
				I=j=0;
			}
			a[i]=-j;
			System.out.println(Arrays.toString(b));
		}
		for(j*=2;--I>=0&j-->0;b[I]++);
		for(i=0;i<n;i++)
			if(a[i]==-V) {
				I=0;
				c=V*3;
				for(j=i+a[i];j>=0&c-->0;I+=b[j]>0?0:1);
				r=r>I?r:I;
			}
		for(i=0;i<n;r+=a[i++]>0?1:0);
		System.out.print(r);
	}
}
