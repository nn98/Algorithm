package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	static int x,n,m,i,j,k,p,q,l,r,a[],t[];
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int u(int n,int s,int e) {
		if(r<s||e<l)return 0;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m)+u(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<n;i*=2);
		j=i;
		t=new int[i*2];
		for(;m<n;x=j+m++,t[x]=s.nextInt(),o());
		System.out.println(Arrays.toString(t));
	}

}
