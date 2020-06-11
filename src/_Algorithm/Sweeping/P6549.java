package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;

public class P6549 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		while(!s.equals("0")) {
			StringTokenizer t=new StringTokenizer(s);
			long n=Integer.parseInt(t.nextToken()),m=0,a[]=new long[(int)n],j;
			int i=0;
			Stack<Integer>k=new Stack();
			for(;i<n;i++) {
				a[(int)i]=Integer.parseInt(t.nextToken());
				while(!k.isEmpty()&&a[(Integer)k.peek()]>a[i]) {
					j=k.pop();
					long w=i;
					if(!k.isEmpty())w-=k.peek()+1;
					long c=a[(int)j]*w;
					m=m<c?c:m;
				}
				k.push(i);
			}
			while(!k.isEmpty()) {
				j=k.pop();
				long w=i;
				if(!k.isEmpty())w-=k.peek()+1;
				long c=a[(int)j]*w;
				m=m<c?c:m;
			}
			System.out.println(m);
			s=r.readLine();
		}
	}
}