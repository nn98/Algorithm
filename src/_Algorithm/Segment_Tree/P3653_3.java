package _Algorithm.Segment_Tree;
// https://lyzqm.blogspot.com/2017/07/segment-tree-3653.html?showComment=1531981580261#c7391195554365601508
// µÇ³²

import java.util.Arrays;
import java.util.Scanner;

public class P3653_3 {

	static int n,m,i,j,t[],x,l,r,a,b,q[],p;
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
		for(;n-->0;) {
			a=s.nextInt();
			b=s.nextInt();
			for(i=1;i<a+b;i*=2);
			j=i;
			q=new int[a];
			t=new int[i*2];
			m=0;
			for(i=b;i<a+b;x=j+i++,t[x]=1,o(),q[m]=b+m++);
			System.out.println(Arrays.toString(q));
			System.out.println(Arrays.toString(t));
			for(i=0;i++<b;) {
				m=s.nextInt()-1;
				p=r=q[m];
				r--;
//				System.out.print(l+" ~ "+r+" = ");
//				System.out.println(u(1,0,j-1)+" ");
				System.out.print(u(1,0,j-1)+" ");
				t[j+p]=0;
				q[m]=b-i;
				t[j+q[m]]=1;
				x=j+p;
				o();
				x=j+q[m];
				o();
//				System.out.println(Arrays.toString(q));
//				System.out.println(Arrays.toString(t));
			}
		}
	}

}