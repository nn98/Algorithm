package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;
public class P1725 {
	static long n,M,a[];
	static int i;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new long[(int) n];
		Stack<Integer>s=new Stack();
		for(;i<n;){
			a[i]=Integer.parseInt(r.readLine());
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				long c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=a[(int) c]*w;
				M=M>k?M:k;
			}
			s.push(i++);
		}
		if(i<n)
			while(!s.isEmpty()&&a[s.peek()]>a[i]) {
				int c=s.pop(),w=i,k;
				if(!s.isEmpty())w-=s.peek()+1;
				k=(int) (a[c]*w);
				M=M>k?M:k;
			}
		System.out.println(M);
	}

}
