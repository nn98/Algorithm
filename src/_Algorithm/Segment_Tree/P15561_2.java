package _Algorithm.Segment_Tree;
import java.util.Scanner;
public class P15561_2 {
	static int n,m,i,j,l,x,y,a[],u,v;
	static class N{
		int l,r,v,a;
		N(int q,int w,int e,int s){
			l=q;
			r=w;
			v=e;
			a=s;
		}
	}
	static N[]b;
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		l=1;
		for(;l<=n;l*=2);
		a=new int[n];	
		b=new N[n];
		for(;i<n;a[i++]=s.nextInt());
		while(m-->0) {
			n=s.nextInt();
		}
	}
}
