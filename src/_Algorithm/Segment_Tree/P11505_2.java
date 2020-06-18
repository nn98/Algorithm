package _Algorithm.Segment_Tree;
import java.util.Arrays;
import java.util.Scanner;

public class P11505_2 {

	static int n,m,i,x,j,v;
	static long d,a[],t[],M=1000000007;
	static long o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)*o(n*2+1,m+1,e)%M;
	}
//	static void p(int n,int s,int e,int x,long d) {
//		if(x<s||x>e)return;
//		t[n]+=d;
//		if(s!=e) {
//			int m=(s+e)/2;
//			p(n*2,s,m,x,d);
//			p(n*2+1,m+1,e,x,d);
//		}
//	}
	static void p() {
		int x=i+j-1;
		t[x]=v;
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]%M);
	}
	static long u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 1;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)+u(n*2+1,m+1,e,l,r);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt()+s.nextInt();
		a=new long[n];
		for(;i<n;a[i++]=s.nextLong());
		for(i=1;i<n;i*=2);
		j=i;
		i*=2;
		t=new long[i];
		Arrays.fill(t,1);
		o(1,0,--n);
		System.out.println(Arrays.toString(t));
		for(;m-->0;) {
			if(s.nextInt()==1) {
				i=s.nextInt()-1;
				v=s.nextInt();
				
			}else
				System.out.println(u(1,0,n,s.nextInt()-1,s.nextInt()-1));
		}
	}
}