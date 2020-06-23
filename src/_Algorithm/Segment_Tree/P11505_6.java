package _Algorithm.Segment_Tree;
// 이제야 이해되네 시벌거
import java.util.*;
import java.io.*;
public class P11505_6 {
	static int x,n,m,i,j,k,l,r;
	static long t[],M=1000000007;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]%M);
	}
	static long u(int n,int s,int e) {
		if(r<s||e<l)return 1;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m)*u(n*2+1,m+1,e)%M;
	}
	public static void main(String[]Z)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter W=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer z=new StringTokenizer(R.readLine());
		n=Integer.parseInt(z.nextToken());
		m=Integer.parseInt(z.nextToken())+Integer.parseInt(z.nextToken());
		for(i=1;i<n;i*=2);
		j=i;
		t=new long[i*2];
		Arrays.fill(t,1);
		for(i=0;i<n;x=j+i++,t[x]=Integer.parseInt(R.readLine()),o());
		for(;m-->0;) {
			z=new StringTokenizer(R.readLine());
			k=Integer.parseInt(z.nextToken());
			if(k>1) {
				l=Integer.parseInt(z.nextToken())-1;
				r=Integer.parseInt(z.nextToken())-1;
				W.write(u(1,0,j-1)+"\n");
			}else {
				x=Integer.parseInt(z.nextToken())-1+j;
				t[x]=Integer.parseInt(z.nextToken());
				o();
			}
		}
		W.flush();
	}
}