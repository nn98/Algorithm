package _Algorithm.DFS;

//각 이동위치별 확률 구하고 DFS로 실행해서 확률 합 구하기

import java.util.Scanner;

public class P1405_C {

	static int n,x[]= {0,0,1,-1},y[]= {1,-1,0,0},i;
	static double c,p[]=new double[4];
	static boolean[][]v=new boolean[30][30];
	static void o(int i,int j,double m,double u) {
		if(u==n)c+=m;
		else {
			for(int k=0;k<4;k++) {
				int I=i+x[k],J=j+y[k];
				if(!v[I][J]&p[k]>0) {
					v[I][J]=true;
					o(I,J,m*p[k],u+1);
					v[I][J]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i<4;p[i++]=s.nextDouble()/100);
		v[15][15]=true;
		o(15,15,1.0,0);
		System.out.println(c);
	}

}
