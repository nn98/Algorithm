package _Algorithm.Segment_Tree;

import java.util.Scanner;

public class Test04 {

	static int x,n,m,i,j,k,p,q,l,r,a[],t[];
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int u(int n,int s,int e) {
		if(r<s||e<l)return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
	}

}
