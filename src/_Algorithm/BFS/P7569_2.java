package _Algorithm.BFS;
//https://www.acmicpc.net/problem/7576
//토마토
//익은 토마토 위치를 큐에 삽입해 정확히 순서대로 시뮬 - AC 
//총 52분
import java.io.*;
import java.util.*;
public class P7569_2 {

	static int n,m,a[][],i,j,k,x,y,R,s[]=new int[3],h[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1};
	static Queue<Integer>P=new LinkedList(),Q=new LinkedList();
	static void o(int x,int y,int v) {
//		System.out.println(x+" "+y+" "+v);
		h[x][y]=v++;
		int i=0,X,Y;
		for(;i<4;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<m) {
				if(a[X][Y]==0)if(h[X][Y]==0)o(X,Y,v);else if(h[X][Y]>v)o(X,Y,v);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		m=Integer.parseInt(t.nextToken());
		n=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;) {
				a[i][j]=Integer.parseInt(t.nextToken());
				if(a[i][j]==1) {
					P.add(i);
					Q.add(j);
				}
				s[a[i][j++]+1]++;
			}
		}
		if(n*m==(s[0]+s[2])) {
			System.out.println(0);
			return;
		}
//		System.out.println(P.toString());
//		System.out.println(Q.toString());
		while(!P.isEmpty()&!Q.isEmpty()) {
//			System.out.println("9");
			x=P.remove();
			y=Q.remove();
			for(k=0;k<4;k++) {
				i=x+p[k];
				j=y+q[k];
//				System.out.println(i+" "+j);
				if(i>=0&i<n&j>=0&j<m) {
//					System.out.println("\t"+i+" "+j);
					if(a[i][j]==0) {
						a[i][j]=a[x][y]+1;
						P.add(i);
						Q.add(j);
					}
				}
			}
//			System.out.println(P.toString());
//			System.out.println(Q.toString());
		}
//		for(i=0;i<n;i++)for(j=0;j<m;j++)if(a[i][j]==1)o(i,j,1);
//		System.out.println(Arrays.toString(s));
//		for(int[]b:a)System.out.println(Arrays.toString(b));
		s[2]=0;
		for(i=0;i<n;i++)for(j=0;j<m;j++) {
			if(a[i][j]>0) {
				s[2]++;
			}
			R=Math.max(a[i][j],R);
		}
//		System.out.println(Arrays.toString(s));
		System.out.println(s[2]+s[0]==n*m?R-1:-1);
	}

}
