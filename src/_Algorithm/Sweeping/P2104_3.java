package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P2104_3 {

	static int n,m,i=1,k,h,a[];
	static long R,w,e,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine())+1;
		a=new int[n+1];
		u=new long[n];
		Stack<Integer>t=new Stack();
		StringTokenizer T=new StringTokenizer(r.readLine());
		for(;i<=n+1;i++) {
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
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(u));
		System.out.print(R);
	}
}