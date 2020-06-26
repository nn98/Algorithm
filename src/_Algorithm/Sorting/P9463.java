package _Algorithm.Sorting;

import java.util.Scanner;

public class P9463 {
	static int n,i,a[],b[],A[],m,v=100001;
	static long R;
	static void o(int f,int t) {
		if(f<t) {
			int m=(f+t)/2;
			o(f,m);
			o(m+1,t);
			m(f,m,t);
		}
	}
	static void m(int p, int q, int r){
		int idx = p;
		int i = p, j = q+1;
		int cnt = 0;
		while(i<=q || j<=r){
			if(i > q){
				b[idx++] = a[j++]; cnt++;
			}else if(j > r){
				b[idx++] = a[i++]; R += cnt;
			}else if(a[i] <= a[j]){
				b[idx++] = a[i++]; R += cnt;
			}else{
				b[idx++] = a[j++]; cnt++;
			}
		}
		for(i=p; i<=r; i++) a[i] = b[i];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(m=s.nextInt();m-->0;) {
			n=s.nextInt();
			R=0;
			A=new int[v];
			for(i=0;i<n;A[s.nextInt()]=i++);
			a=new int[v];
			b=new int[v];
			for(i=0;i<n;a[i++]=A[s.nextInt()]);
			o(0,n-1);
			System.out.println(R);
		}
	}
}