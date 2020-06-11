package _Algorithm.Sweeping;

import java.io.*;
import java.util.*;

public class P6549 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s=r.readLine();
		while(!s.equals("0")) {
			StringTokenizer t=new StringTokenizer(s);
			int n=Integer.parseInt(t.nextToken()),i=0,a[]=new int[n],j;
			long m=0;
			Stack<Integer>k=new Stack();
			for(;i<n;i++) {
				a[i]=Integer.parseInt(t.nextToken());
				while(!k.isEmpty()&&a[k.peek()]>a[i]) {
					j=k.pop();
					long w=i;
					if(!k.isEmpty())w-=k.peek()+1;
					long c=a[j]*w;
					m=(int) (m<c?c:m);
				}
				k.push(i);
			}
			while(!k.isEmpty()) {
				j=k.pop();
				long w=i;
				if(!k.isEmpty())w-=k.peek()+1;
				long c=a[j]*w;
				m=(int) (m<c?c:m);
			}
			System.out.println(m);
			s=r.readLine();
		}
	}
}