package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P2104 {

	static int n,m,i,j,k,v,a[];
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
//			팝하는 조건에서 문제가 있나?
			while(!t.isEmpty()&&a[t.peek()]>j) {
				k=t.pop();
				v=a[k];
				System.out.println("k: "+k);
				System.out.println("v: "+v);
				m=m<v?m:v;
				w+=v;
				e=w*m;
				System.out.println("\tat - "+i+": "+w+" * "+m+" = "+e);
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
			System.out.println(w+" * "+m+" = "+e);
			R=R>e?R:e;
		}
		System.out.print(R);
	}

}
