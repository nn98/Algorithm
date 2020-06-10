package _Algorithm.Sweeping;
// Sum �迭 �߰�.

import java.io.*;
import java.util.*;
public class P2104_2 {

	static int n,m,i,k,v,a[];
	static long R,w,e,u[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		u=new long[n];
		Stack<Integer>t=new Stack();
		for(String s:r.readLine().split(" ")) {
			a[i]=Integer.parseInt(s);
			if(i>0)u[i]=u[i-1]+a[i];
			else u[i]=a[i];
			while(!t.isEmpty()&&a[t.peek()]>a[i]) {
				k=t.pop();
				v=a[k];
				int p=t.isEmpty()?0:k;
				R=Math.max(R,(u[i-1]-u[p])*v);
			}
			t.push(i++);
		}
		System.out.print(R);
	}
}