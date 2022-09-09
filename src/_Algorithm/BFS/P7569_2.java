package _Algorithm.BFS;
//https://www.acmicpc.net/problem/7569
//토마토
//익은 토마토 위치를 큐에 삽입해 정확히 순서대로 시뮬 - AC
//측정못함
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
		a=new int[b][n][m];
		for(;i<b;i++) {
			for(j=0;j<n;j++) {
				t=new StringTokenizer(r.readLine());
				for(k=0;k<m;k++) {
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
		while(!P.isEmpty()&!Q.isEmpty()&!W.isEmpty()) {
			x=P.remove();
			y=Q.remove();
			z=W.remove();
			for(k=0;k<6;k++) {
				i=x+p[k];
				j=y+q[k];
				c=z+w[k];
				if(i>=0&i<b&j>=0&j<n&c>=0&c<m) {
					if(a[i][j][c]==0) {
						a[i][j][c]=a[x][y][z]+1;
						P.add(i);
						Q.add(j);
						W.add(c);
					}
				}
			}
		}
		s[2]=0;
		for(i=0;i<b;i++)for(j=0;j<n;j++)for(k=0;k<m;k++) {
			if(a[i][j][k]>0) {
				s[2]++;
			}
			R=Math.max(a[i][j][k],R);
		}
		System.out.println(s[2]+s[0]==n*m*b?R-1:-1);
	}
}