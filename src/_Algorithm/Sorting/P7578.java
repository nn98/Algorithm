package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P7578 {
	static int n,i,a[],b[],A[];
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
			System.out.println(i<=q | j<=r);
			if(i > q){
				System.out.println(55);
				b[idx++] = a[j++]; cnt++;
			}else if(j > r){
				System.out.println(66);
				b[idx++] = a[i++]; R += cnt;
			}else if(a[i] <= a[j]){
				System.out.println(77);
				b[idx++] = a[i++]; R += cnt;
			}else{
				System.out.println(88);
				b[idx++] = a[j++]; cnt++;
			}
		}
		for(i=p; i<=r; i++) a[i] = b[i];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		A=new int[1000001];
		for(;i<n;A[s.nextInt()]=i++);
		a=new int[500010];
		b=new int[500010];
		for(i=0;i<n;a[i++]=A[s.nextInt()]);
//		System.out.println(Arrays.toString(a));
		o(0,n-1);
		System.out.println(R);
	}

}