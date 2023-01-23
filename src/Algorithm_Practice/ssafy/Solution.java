package ssafy;

import java.io.*;
import java.util.*;

class Solution
{
	static int n,m,i,j,x,f,e,o,u,a[],b[],q;
	public static void main(String args[]) throws Exception
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
//			System.out.println(n+" "+m);
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m];
			b=new int[m];
			for(i=0;i<m;f=Integer.parseInt(t.nextToken())%2,e+=f==0?1:0,o+=f==0?0:1,a[i++]=f);
//			System.out.println("a: "+Arrays.toString(a)+" "+e+" "+o);
			if(e>(m+1)/2|o>(m+1)/2)u=-1;
			else {
				if(e>o) {
					for(j=0;j<m;b[j]=j++%2==0?0:1);
				}else {
					for(j=0;j<m;b[j]=j++%2==0?1:0);
				}
//				System.out.println("b: "+Arrays.toString(b));
				for(q=0;q<m;q++) {
					if(a[q]!=b[q]) {
//						System.out.println("\t"+Arrays.toString(a));
						for(i=q;a[++i]==a[q]&i<m;);
						u+=i-q;
						j=a[q];
						a[q]=a[i];
						a[i]=j;
					}
				}
			}
			System.out.println(String.format("#%d %d",++x,u));
			e=o=u=0;
		}
	}
}