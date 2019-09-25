package BaekJoon;

import java.util.Scanner;

public class P1149_2 {
	static int sol(int[][] arr,int d,int h,int r) {
		if(d==arr.length) return r;
		System.out.printf("d: %d, h: %d , r: %d\n",d,h,r);
		if(h==0) {
			int a=sol(arr,d+1,1,r+arr[d][1]),b=sol(arr,d+1,2,r+arr[d][2]);
			return a<=b?a:b;
//			int t=arr[d][1]<=arr[d][2]?1:2;
//			return sol(arr,d+1,t,r+(arr[d][t]));
		}
		else if(h==1) {
			int a=sol(arr,d+1,0,r+arr[d][0]),b=sol(arr,d+1,2,r+arr[d][2]);
			return a<=b?a:b;
		}
		else {
			int a=sol(arr,d+1,0,r+arr[d][0]),b=sol(arr,d+1,1,r+arr[d][1]);
			return a<=b?a:b;
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),arr[][]=new int[N][3];
		int his=-1;
		for(int i=0;i<N;i++) {
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
			arr[i][2]=s.nextInt();
		}
		int a=sol(arr,0,0,0),b=sol(arr,0,1,0),c=sol(arr,0,2,0);
		int r=a<=b?a:b;
		r=r<=c?r:c;
		System.out.println(r);
	}
}
