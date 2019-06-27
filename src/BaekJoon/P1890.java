package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1890 {
	static int N;
	static long[][] arr;
	static long[][] sum;
	static long sol(long h,long w) {
		System.out.println("h: "+h+"w: "+w);
		//if( h == N - 1 && w == N - 1) return 0;
		if(h>=arr.length||w>=arr.length) return 0;
		if(sum[(int) h][(int) w]!=0) return sum[(int) h][(int) w];
		if(arr[(int) h][(int) w]==0) sum[(int) h][(int) w]=1;
		else sum[(int) h][(int) w]=sol(h+arr[(int) h][(int) w],w)+sol(h,w+arr[(int) h][(int) w]);
		return sum[(int) h][(int) w];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		arr=new long[N][N];
		sum=new long[N][N];
		for(int i=0;i<N;i++) 
			for(int j=0;j<N;j++) 
				arr[i][j]=s.nextInt();
		System.out.println(sol(0,0));
		for(int i=0;i<N;i++) {
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(sum[i]));
		}
	}

}
