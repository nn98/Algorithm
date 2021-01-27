package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P2268 {

	static int n,m,i,j,x,y,l,a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static long p(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e);
		if(s>y|x>e)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		while(m-->0) {
			x=s.nextInt();
			if(x>0) {
				a[j=s.nextInt()-1+l]=s.nextInt();
				o();
				System.out.println(Arrays.toString(a));
			}else {
				x=s.nextInt();
				y=s.nextInt();
				System.out.println(p(1,1,l));
			}
		}
		
	}

}
