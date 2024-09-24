package Algorithm_Practice.ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TestCode_ST {
	static List<Integer>list;
	static int n,m,i,l=1,j,a[],s=1,e,k;
	static char[]b;
//	BT - dup X
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
//	BT - dup O
	static int p(int n,int h,int t) {
		if(h>e|t<s)return 0;
		if(s>=h&e<=t)return a[n];
		int m=(h+t)/2;
		return p(n*2,h,m)+p(n*2+1,m+1,t);
	}
	public static void main(String args[])throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		for(;l<n;l*=2);
		e=l;
		a=new int[l*2];
		t=new StringTokenizer(r.readLine());
		for(;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),o());
		System.out.println(Arrays.toString(a));
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			k=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			if(k<2) {
				j+=l;
				a[j]=i;
				o();
				System.out.println(Arrays.toString(a));
			}else {
				System.out.println(p(1,j,i));
			}
		}
	}
}
