package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	static int x,n,m,i,j,k,p,q,l,r,a[],t[];
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int u(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e);
		if(r<s||e<l) {
			System.out.println("\t1. re 0");
			return 0;
		}
		if(l<=s&&e<=r) {
			System.out.println("\t2. re "+t[n]);
			return t[n];
		}
		System.out.println("\t3.");
		int m=(s+e)/2,l=u(n*2,s,m),r=u(n*2+1,m+1,e);
		System.out.println("\t\t>3. left "+l+" right "+r);
		return l+r;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=s.nextInt();
		for(i=1;i<n;i*=2);
		j=i;
		t=new int[i*2];
		for(;m<n;x=j+m++,t[x]=s.nextInt(),o());
		System.out.println(Arrays.toString(t));
		for(;p-->0;l=s.nextInt(),r=s.nextInt(),System.out.println(u(1,0,n-1)));
	}

}