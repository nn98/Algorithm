package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1937_Time {

	static int n,a[][],r=0,i=1,j,h[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1};
	static void o(int x,int y,int v) {
		h[x][y]=v;
		r=r>v?r:v;
		for(int k=0;k<4;k++) {
			int X=x+p[k],Y=y+q[k];
			if(a[X][Y]!=0&&a[X][Y]<a[x][y]) {
				if(h[X][Y]<=v)
					o(X,Y,v+1);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		long A=System.currentTimeMillis();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());
		a=new int[n+2][n+2];
		h=new int[n+2][n+2];
		for(;i<n+1;i++) {
			j=1;
			for(String t:b.readLine().split(" "))
				a[i][j++]=Integer.parseInt(t);
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(a[i]));
		for(i=1;i<n+1;i++) {
			for(j=1;j<n+1;j++) {
				//				System.out.println(i-1+" "+(j-1)+" "+a[i][j]);
				boolean c=true;
				for(int k=0;k<4;k++) {
					int x=i+p[k],y=j+q[k];
					if(a[x][y]!=0&&a[x][y]>a[i][j]) {
						c=false;
						break;
					}
				}
				if(c) {
					//					System.out.println(i-1+" "+(j-1));
					//					h[i][j]=1;
					o(i,j,1);
				}
			}
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(h[i]));
		System.out.print(r);
		System.out.println(System.currentTimeMillis()-A);
	}
}