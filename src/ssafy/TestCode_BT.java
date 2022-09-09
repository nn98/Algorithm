package ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestCode_BT {
	static int n,m,i,j,a[];
	static char[]b;
//	BT - dup X
	static void o(int x) {
		if(x==m) {
			System.out.println(b);
		}else {
			for(int i=0;i<n;i++) {
				if(a[i]<1) {
					a[i]++;
					b[x]=(char)('0'+i);
					o(x+1);
					a[i]--;
				}
			}
		}
	}
//	BT - dup O
	static void p(int x) {
		if(x==m)System.out.println(b);
		else for(int i=0;i<n;i++) {
			b[x]=(char)('0'+i);
			p(x+1);
		}
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n];
		b=new char[m];
		o(0);
		System.out.println();
		p(0);
	}
}
