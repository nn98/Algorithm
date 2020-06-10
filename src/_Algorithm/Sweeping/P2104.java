package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P2104 {

	static int n,m,i,j,k,a[];
	static long R,w,e;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		Stack<Integer>t=new Stack();
		for(String s:r.readLine().split(" ")) {
			j=a[i]=Integer.parseInt(s);
			w=0;
			m=Integer.MAX_VALUE;
			while(!t.isEmpty()&&a[t.peek()]>j) {
				k=t.pop();
				m=m<k?m:k;
				w+=k;
				e=w*m;
				R=R>e?R:e;
			}
			t.push(i++);
		}
		w=0;
		m=Integer.MAX_VALUE;
		while(!t.isEmpty()&&a[t.peek()]>j) {
			k=t.pop();
			m=m<k?m:k;
			w+=k;
			e=w*m;
			R=R>e?R:e;
		}
		System.out.print(R);
	}

}
