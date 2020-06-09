package _Algorithm.Divide_Conquer;
//https://navy-apple.com/algorithms/BOJ/2104
import java.io.*;
import java.util.*;
public class P2104_6{
	static int n,i;
	static long[]a=new long[100001];
	static long o(int f,int t) {
		if(f==t)return a[f]*a[f];							// ÇÑÄ­Àº Á¦°ö ¸®ÅÏ 			+
		int m=(f+t)>>1,l=m,r=m;								// ÀÎµ¦½ºÀÇ ÇÕÀ» 1>? µ¿ÀÏ º¯¼ö	-
		long A=Math.max(o(f,m),o(m+1,t)),n=a[m],s=n,p,q;	// A ¾ÕµÞºÎºÐ Àç±Í Å«°ª
		System.out.println(f+" "+t+" "+m);					//
		while(r-l<t-f) {									//
			p=l>f?(a[l-1]+s)*Math.min(n,a[l-1]):-1;			//
			q=r<t?(a[r+1]+s)*Math.min(n,a[r+1]):-1;			//
			if(p>q) {										//
				s+=a[l-1];									//
				n=Math.min(n,a[l---1]);						//
			}else {											//
				s+=a[r+1];									//
				n=Math.min(n, a[r+++1]);					//
			}								
			A=Math.max(A, s*n);								//
		}
		return A;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i++<n;a[i]=Integer.parseInt(t.nextToken()));
		System.out.println(o(1,n));
	}
}