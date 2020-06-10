package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P1725 {
	static int n,M,a[],i;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		Stack<Integer>s=new Stack();
		for(String g:r.readLine().split(" ")) {
			a[i]=Integer.parseInt(g);
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				int c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=a[c]*w;
				M=M>k?M:k;
			}
			s.push(i++);
		}
		if(i<n)
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				int c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=a[c]*w;
				M=M>k?M:k;
			}
		System.out.println(M);
	}

}
