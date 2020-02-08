package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12858{
	static int G(int a,int b) {
		return b==0?a:G(b,a%b);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],m=Integer.parseInt(r.readLine()),b[]=new int[3],p,q;
		for(;m-->0;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(n=0;n<3;b[n++]=Integer.parseInt(t.nextToken()))
			if(b[0]>0)for(;b[1]<b[2];a[b[1]++]+=b[0]);
			else {
				p=a[b[1]];
				for(;++b[1]<b[2];q=G(p,a[b[1]]),p=p>q?p:q);
				System.out.println(p);
			}
		}
	}
}