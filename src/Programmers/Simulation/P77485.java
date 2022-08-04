package Programmers.Simulation;

import java.util.Arrays;

public class P77485 {
	static public int[] solution(int n, int m, int[][]q) {
        int i=0,j,k=0,answer[]={},a[][]=new int[n][m],x,y,t,u;
        for(;i<n;i++)for(j=0;j<m;a[i][j]=i*n+j+++1);
        for(;k<q.length;k++) {
        	i=q[k][0]-1;
        	j=q[k][1]-1;
        	x=q[k][2]-1;
        	y=q[k][3]-1;
        	t=a[i][y];
        	for(u=y;u>j;u--) {
        		if(u==j-1) a[i][u]=t;
        		else a[i][u]=a[i][u-1];
        	}
          for(int[]b:a)System.out.println(Arrays.toString(b));
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][]a={{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		System.out.println(Arrays.toString(solution(6,6,a)));
	}

}
