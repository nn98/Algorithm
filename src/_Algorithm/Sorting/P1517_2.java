package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1517_2 {
	static int n,i,a[],b[];
	static long r;
	static void o(int f,int t) {
		if(f<t) {
			int m=(f+t)/2;
			o(f,m);
			o(m+1,t);
			m(f,t,m);
		}
	}
	static void m(int p, int q, int R){
		int idx = p;
		int i = p, j = q+1;
		int cnt = 0;
		while(i<=q || j<=R){
			if(i > q){
				b[idx++] = a[j++]; cnt++;
			}else if(j > R){
				b[idx++] = a[i++]; r += cnt;
			}else if(a[i] <= a[j]){
				b[idx++] = a[i++]; r += cnt;
			}else{
				b[idx++] = a[j++]; cnt++;
			}
		}
		for(i=p; i<=R; i++) a[i] = b[i];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[500010];
		b=new int[500010];
		for(;i<n;a[i++]=s.nextInt());
//		System.out.println(Arrays.toString(a));
		o(0,n-1);
//		for(i=0;i<n;System.out.println(a[i++]));
//		System.out.println(Arrays.toString(a));
		System.out.println(r);
	}

}