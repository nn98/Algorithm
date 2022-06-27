package _Algorithm.BFS;
//https://www.acmicpc.net/problem/7576
//토마토
//익은 토마토 위치를 큐에 삽입해 정확히 순서대로 시뮬 - AC 
//총 52분
import java.io.*;
import java.util.*;
public class P7569_2 {

	static int n,m,b,a[][][],i,j,k,x,y,z,c,R,s[]=new int[3],h[][],p[]= {1,0,-1,0,0,0},q[]= {0,1,0,-1,0,0},w[]= {0,0,0,0,1,-1};
	static Queue<Integer>P=new LinkedList(),Q=new LinkedList(),W=new LinkedList();
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		m=Integer.parseInt(t.nextToken());
		n=Integer.parseInt(t.nextToken());
		b=Integer.parseInt(t.nextToken());
		a=new int[n][m][b];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;j++) {
				for(k=0;k<b;k++) {
					a[i][j][k]=Integer.parseInt(t.nextToken());
					if(a[i][j][k]==1) {
						P.add(i);
						Q.add(j);
						W.add(k);
					}
					s[a[i][j][k]+1]++;
				}
			}
		}
		if(n*m==(s[0]+s[2])) {
			System.out.println(0);
			return;
		}
//		System.out.println(P.toString());
//		System.out.println(Q.toString());
		while(!P.isEmpty()&!Q.isEmpty()&!W.isEmpty()) {
//			System.out.println("9");
			x=P.remove();
			y=Q.remove();
			z=W.remove();
			for(k=0;k<6;k++) {
				i=x+p[k];
				j=y+q[k];
				c=z+w[k];
//				System.out.println(i+" "+j);
				if(i>=0&i<n&j>=0&j<m&c>=0&c<b) {
//					System.out.println("\t"+i+" "+j);
					if(a[i][j][c]==0) {
						a[i][j][c]=a[x][y][z]+1;
						P.add(i);
						Q.add(j);
						W.add(c);
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
		for(i=0;i<n;i++)for(j=0;j<m;j++)for(k=0;k<b;k++) {
			if(a[i][j][k]>0) {
				s[2]++;
			}
			R=Math.max(a[i][j][k],R);
		}
//		System.out.println(Arrays.toString(s));
		System.out.println(s[2]+s[0]==n*m?R-1:-1);
	}

}
