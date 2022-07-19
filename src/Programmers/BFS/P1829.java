package Programmers.BFS;
import java.io.*;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/1829
public class P1829 {
	static int h[][],R,S,C,answer[]=new int[2],i,j,p[]={0,1,0,-1},q[]={1,0,-1,0},M,N,picture[][];
    static public int[] solution(int m, int n, int[][] picture) {
        M=m;
        N=n;
        h=new int[m][n];
        for(;i<m;i++)for(j=0;j<n;j++)if(picture[i][j]>0&h[i][j]<1){
            o(i,j,picture);
            R=R>S?R:S;
            S=0;
            C++;
        }
        answer[0] = C;
        answer[1] = R;
        return answer;
    }
    static void o(int x,int y,int[][]P){
        h[x][y]++;
        S++;
        int i=0,X,Y;
        for(;i<4;i++){
            X=x+p[i];
            Y=y+q[i];
            if(X>=0&X<M&Y>=0&Y<N)if(P[X][Y]==P[x][y])o(X,Y,P);
        }
    }
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		M=Integer.parseInt(t.nextToken());
		N=Integer.parseInt(t.nextToken());
		picture=new int[M][N];
		for(;i<M;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<N;picture[i][j++]=Integer.parseInt(t.nextToken()));
		}
		System.out.println(Arrays.toString(solution(M,N,picture)));
	}

}
