package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1018 {

	static char[][]C;
	static int n,m,l=Integer.MAX_VALUE;
	static void o(int x,int y) {
		int c=0,d=0;
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if((i+j)%2==0) {
					if(C[i][j]=='W')
						c++;
				}
				else
					if(C[i][j]=='B')
						c++;
			}
		}
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if((i+j)%2==0) {
					if(C[i][j]=='B')
						d++;
				}
				else
					if(C[i][j]=='W')
						d++;
			}
		}
		l=l<c?l:c;
		l=l<d?l:d;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]a=r.readLine().split(" ");
		n=Integer.parseInt(a[0]);
		m=Integer.parseInt(a[1]);
		C=new char[n][];
		for(int i=0;i<n;i++)
			C[i]=r.readLine().toCharArray();
		for(int i=0;i<n-7;i++)
			for(int j=0;j<m-7;j++)
				o(i,j);
		System.out.print(l);
	}

}
