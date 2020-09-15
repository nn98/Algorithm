package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P2042_4 {

	static int n,m,i,j,t[],k,l;
	static void o() {
		while(i>1)t[i/=2]=t[i*2]+t[i*2+1];
	}
	static int p(int n,int s,int e) {
		if(j<s|e<i)return 0;
		if(i<=s&e<=j)return t[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		m+=s.nextInt();
		for(i=1;i<n;l=i*=2);
		t=new int[l*2];
		for(;j<n;t[l+j++]=s.nextInt());
//		System.out.println(Arrays.toString(t));
		for(;k<n;i=l+k++,o());
//		System.out.println(Arrays.toString(t));
		while(m-->0) {
			k=s.nextInt();
			i=s.nextInt();
			j=s.nextInt();
			if(k==1) {
				i+=l-1;
				t[i]=j;
				o();
			}else {
				System.out.println(p(1,1,n));
			}
		}
	}

}
