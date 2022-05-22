package Baekjoon;

import java.util.Scanner;

public class Q4344 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C=s.nextInt();
		float[] r=new float[C];
		for (int i=0;i<C;i++) {
			int sum=0,count=0;
			int N=s.nextInt();
			int[] M=new int[N];
			for(int j=0;j<N;j++) {
				M[j]=s.nextInt();
				sum+=M[j];
			}
			for(int k=0;k<N;k++) if(M[k]>sum/N) count++;
			r[i]=(float)count/N;
		}
		for (int i=0;i<C;i++) System.out.printf("%.3f%%\n",r[i]*100);
	}

}
