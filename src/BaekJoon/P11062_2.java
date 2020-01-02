package BaekJoon;

import java.util.Scanner;

public class P11062_2 {
	static int n,m,A[],f,e;
	static void o(int q,int p,int a,int b,boolean c,int d) {
		if(d==m) {
			if(a>f) {
				f=a;
				e=b;
			}
			if(b>e) {
				f=a;
				e=b;
			}
			return;
		}
		if(c) {
			o(q+1,p,a+A[q],b,false,d+1);
			o(q,p-1,a+A[p],b,false,d+1);
		}else {
			o(q+1,p,a,b+A[q],true,d+1);
			o(q,p-1,a,b+A[p],true,d+1);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;n-->0;) {
			f=0;
			e=0;
			m=s.nextInt();
			A=new int[m];
			for(int i=0;i<m;A[i++]=s.nextInt());
			o(0,m-1,0,0,true,0);
			System.out.println(f+" "+e);
		}
	}

}
