package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P2104_3 {

	static int n,m,i=1,k,a[];
	static long R,w,e,h,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n+2];
		a[n+1]=0;
		u=new long[n+2];
		Stack<Integer>t=new Stack();
		StringTokenizer T=new StringTokenizer(r.readLine());
		for(;i<=n;i++) {
			a[i]=Integer.parseInt(T.nextToken());
			u[i]=u[i-1]+a[i];
			while(!t.isEmpty()&&a[t.peek()]>a[i]) {
				k=t.pop();
				h=a[k];
				int p=t.isEmpty()?0:t.peek();
				R=Math.max(R,(u[i-1]-u[p])*h);
			}
			t.push(i);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(u));
		System.out.print(R);
	}
}