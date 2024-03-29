package BaekJoon.Divide_Conquer;
// 0���� �ٲ�°� �����ϳ�
import java.util.Arrays;
import java.util.Scanner;

public class P11505 {
	static int n,m,i,x,q=1000000007;
	static long w,d,a[],t[];
	static long o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)*o(n*2+1,m+1,e)%q;
	}
	static void p(int n,int s,int e,int x) {
		if(x<s||x>e)return;
		if(w==0)t[n]=0;
		else t[n]/=w;
		if(s!=e) {
			int m=(s+e)/2;
			p(n*2,s,m,x);
			p(n*2+1,m+1,e,x);
		}
		t[n]*=d;
	}
	static long u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 1;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)*u(n*2+1,m+1,e,l,r)%q;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt()+s.nextInt();
		a=new long[n];
		for(;i<n;a[i++]=s.nextLong());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new long[i];
		Arrays.fill(t,1);
		o(1,0,--n);
		for(;m-->0;) {
			if(s.nextInt()==1) {
				x=s.nextInt()-1;
				w=a[x];
				d=a[x]=s.nextLong();
				p(1,0,n,x);
				System.out.println(Arrays.toString(t));
			}else
				System.out.println(u(1,0,n,s.nextInt()-1,s.nextInt()-1));
		}
	}
}