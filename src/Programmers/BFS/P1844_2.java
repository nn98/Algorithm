package Programmers.BFS;

import java.util.*;

public class P1844_2 {
	static int n,m,a[][],h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0},i,X,Y,b[],x,y;
	static public int solution(int[][]s) {
        n=s.length;
        m=s[0].length;
        h=new int[n][m];
        h[0][0]++;
        Queue<int[]>Q=new LinkedList();
        Q.add(new int[]{0,0});
        while(!Q.isEmpty()) {
        	b=Q.remove();
        	x=b[0];
        	y=b[1];
        	for(i=0;i<4;i++) {
        		X=x+p[i];
        		Y=y+q[i];
        		if(X>=0&X<n&Y>=0&Y<m)if((h[X][Y]<1)&a[X][Y]>0) {
        			Q.add(new int[] {X,Y});
        			h[X][Y]=h[x][y]+1;
        		}
        	}
        }
        return h[n-1][m-1]<1?-1:h[n-1][m-1];
    }
//	static void o(int x,int y,int v) {
//		C++;
//		h[x][y]=v++;
//		a[x][y]=0;
//		int i=0,X,Y;
//		for(;i<4;i++) {
//			X=p[i]+x;
//			Y=q[i]+y;
//			if(X>=0&X<n&Y>=0&Y<m)if((h[X][Y]<1|h[X][Y]>v)&a[X][Y]>0)o(X,Y,v);
//		}
//	}
	public static void main(String[] args) {
		int[][]a={{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println(solution(a));
		for(int[]b:h)System.out.println(Arrays.toString(b));
	}

}
