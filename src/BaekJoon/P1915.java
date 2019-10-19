package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1915 {

	static int n,m,l=0;
	static char[][]b;
	static boolean[][]D;
	static void o(int i,int j) {
//		System.out.println(i+" "+j);
		int r=i,e=j;
		boolean c=false;
		while(++i<n&&++j<m) {
			//			System.out.println(i+" "+j);
			int x=r,y=e;
			//			System.out.println("\t"+x+" "+y);
			for(int z=x+1;z<=i;z++) {
				//				System.out.println("\t"+z+" "+y+" "+z+" "+j);
				if(b[z][y]=='0'||b[z][j]=='0') {
					//					System.out.println(55);
					c=true;
					break;
				}
			}
			if(c)break;
			for(int w=y+1;w<=j;w++) {
				//				System.out.println("\t"+x+" "+w+" "+i+" "+w);
				if(b[x][w]=='0'||b[i][w]=='0') {
					//					System.out.println(66);
					c=true;
					break;
				}
			}
			if(c)break;
		}
		for(int f=r+1;f<i-1;f++)
			for(int t=e+1;t<j-1;t++)
				D[f][t]=true;
		l=l>i-r?l:i-r;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]a=r.readLine().split(" ");
		n=Integer.parseInt(a[0]);
		m=Integer.parseInt(a[1]);
		D=new boolean[n][m];
		b=new char[n][];
		for(int i=0;i<n;i++)b[i]=r.readLine().toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(b[i][j]=='1')
					if(!D[i][j])
						o(i,j);
			}
		}
		System.out.print(l*l);
	}
}
/*
5 5
11000
11100
01111
00111
00111
5 5
00000
01110
01110
01110
00000
 */