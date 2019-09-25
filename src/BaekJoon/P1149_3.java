package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1149_3 {

	static int history[][];

	static int sol(int[][] arr,int d,int h,int r) {
		if(d==arr.length) return r;
		System.out.printf("d: %d, h: %d , r: %d\n",d,h,r);
		if(h==0) {
			int a,b;
			if(history[d][1]!=0) a=history[d][1];
			else a=sol(arr,d+1,1,r+arr[d][1]);
			if(history[d][2]!=0) b=history[d][2];
			else b=sol(arr,d+1,2,r+arr[d][2]);
			return history[d][0]=a<=b?a:b;
			//			int t=arr[d][1]<=arr[d][2]?1:2;
			//			return sol(arr,d+1,t,r+(arr[d][t]));
		}
		else if(h==1) {
			int a,b;
			if(history[d][0]!=0) a=history[d][0];
			else a=sol(arr,d+1,0,r+arr[d][0]);
			if(history[d][2]!=0) b=history[d][2];
			else b=sol(arr,d+1,2,r+arr[d][2]);
			return history[d][1]=a<=b?a:b;
		}
		else {
			int a,b;
			if(history[d][0]!=0) a=history[d][0];
			else a=sol(arr,d+1,0,r+arr[d][0]);
			if(history[d][1]!=0) b=history[d][1];
			else b=sol(arr,d+1,1,r+arr[d][1]);
			return history[d][2]=a<=b?a:b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[][]=new int[N][3];
		history=new int[N][3];
		for(int i=0;i<N;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
			arr[i][2]=s.nextInt();
		}
		int a=sol(arr,0,0,0),b=sol(arr,0,1,0),c=sol(arr,0,2,0);
		int r=a<=b?a:b;
		r=r<=c?r:c;
		for(int i=0;i<arr.length;i++) System.out.println(Arrays.toString(history[i]));
		System.out.println(r);
	}

}
