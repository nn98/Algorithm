package BaekJoon;

import java.util.Scanner;

public class P1987_4 {
	static char[][]a;
	static int n,m,u=0,x[]= {0,1,0,-1},y[]= {1,0,-1,0};
	static void o(int i,int j,String b) {
		b+=a[i][j];
		u=u>b.length()?u:b.length();
		int p,q;
		for(int l=0;l<4;l++) {
			p=i+x[l];
			q=j+y[l];
			if(p==0||q==0||p==n||q==m)continue;
			boolean c=true;
			for(int h=0;h<b.length();h++) {
				if(a[p][q]==b.charAt(h)) {
					c=false;
					break;
				}
			}
			if(c)o(p,q,""+b);
		}
	}
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String b;
		int i=0,j=1;
		n=s.nextInt()+2;
		m=s.nextInt()+2;
		a=new char[n--][m--];
		for(;i<n;i++,j=1)for(char c:s.nextLine().toCharArray())a[i][j++]=c;
		o(1,1,"");
		System.out.print(u);
	}
}