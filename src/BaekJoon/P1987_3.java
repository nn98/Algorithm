package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1987_3 {

//	static 
	static char[][]a;
	static int n,m,u=0,x[]= {0,1,0,-1},y[]= {1,0,-1,0};
	static void o(int i,int j,StringBuilder b) {
//	static void o(int i,int j,String b) {
		b.append(a[i][j]);
//		System.out.println(i+" "+j+" "+b+" "+b.length());
		u=u>b.length()?u:b.length();
		int p,q;
		for(int l=0;l<4;l++) {
			p=i+x[l];
			q=j+y[l];
			if(p==0||q==0||p==n-1||q==m-1)continue;
			boolean c=true;
//			System.out.println(b+" ");
			for(int h=0;h<b.length();h++) {
				if(a[p][q]==b.charAt(h)) {
//					System.out.print(a[p][q]+" ");
					c=false;
					break;
				}
			}
			if(c) {
//				System.out.println(b+" go "+p+" "+q+" ");
				o(p,q,new StringBuilder(b));
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b;
		int j=1;
		n=s.nextInt()+2;
		m=s.nextInt()+2;
		s.nextLine();
		a=new char[n][m];
		for(int i=1;i<n-1;i++) {
			j=1;
			for(char c:s.nextLine().toCharArray())
				a[i][j++]=c;
		}
		o(1,1,new StringBuilder());
//		o(1,1,"");
		System.out.println(u);
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(a[i]));
//		}
	}

}
