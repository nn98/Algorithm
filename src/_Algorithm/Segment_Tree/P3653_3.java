package _Algorithm.Segment_Tree;
// https://lyzqm.blogspot.com/2017/07/segment-tree-3653.html?showComment=1531981580261#c7391195554365601508

import java.util.Arrays;
import java.util.Scanner;

public class P3653_3 {

	static int n,m,i,j,k,a[],b[],t[],x,p,l,r;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int u(int n,int s,int e) {
		if(r<s||e<l)return t[n];
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m)+u(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;n-->0;) {
			i=s.nextInt();
			j=s.nextInt();
			a=new int[i];
			b=new int[i+j];
			for(m=1;m<i+j;m*=2);
			k=m;
			t=new int[m*2];
			for(p=i;p<i+j;x=k+p++,t[x]=1,o());
			System.out.println(Arrays.toString(t));
		}
	}

}
