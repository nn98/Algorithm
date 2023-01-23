package BaekJoon.DFS;

import java.util.*;

public class P2210 {

	static int i,j,u,p[]= {0,1,0,-1},q[]= {1,0,-1,0};
	static HashSet<String> t=new HashSet<String>();
	static char[]a[]=new char[5][5],b;
	static void o(int x,int y) {
		if(u>5) {
			t.add(new String(b));
		}
		else {
			b[u++]=a[x][y];
			int i=0,X,Y;
			for(;i<4;i++) {
				X=x+p[i];
				Y=y+q[i];
				if(X>=0&X<5&Y>=0&Y<5)o(X,Y);
			}
			u--;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;i<5;i++) {
			b=s.nextLine().toCharArray();
			for(j=0;j<5;a[i][j]=b[j++*2]);
		}
		b=new char[6];
		for(i=0;i<5;i++)for(j=0;j<5;u=0,o(i,j++));
		System.out.println(t.size());
	}

}