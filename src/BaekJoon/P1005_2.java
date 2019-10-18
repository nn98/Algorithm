package BaekJoon;

import java.util.Scanner;

public class P1005_2 {

	static int n,a[],b[][],d[];
	static int sol(int i) {
		//		System.out.println("sol"+i);
		boolean l=true;
		for(int j:b[i]) {
			if(j>0) {
				l=false;
				break;
			}
		}
		if(l)return d[i]=a[i];
		else {
			int m=0,p;
			for(int j=0;j<n;j++) {
				//				System.out.println(i+" "+j);
				if(b[i][j]>0) {
					if(d[j]<0)
						p=sol(j);
					else 
						p=d[j];
					m=m>p?m:p;
				}
			}
			return d[i]=m+a[i];
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=s.nextInt();i>0;i--) {
			n=s.nextInt();
			d=new int[n];
			int m=s.nextInt(),t,x,y;
			a=new int[n];
			b=new int[n][n];
			for(int j=0;j<n;j++)a[j]=s.nextInt();
			for(int j=0;j<m;j++) {
				x=s.nextInt()-1;
				y=s.nextInt()-1;
				b[y][x]++;
			}
			//			for(int j=0;j<n;j++)System.out.println(Arrays.toString(b[j]));
			t=s.nextInt()-1;
			System.out.println(sol(t));
		}
	}
}