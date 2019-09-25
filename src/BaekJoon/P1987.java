package BaekJoon;

import java.util.Scanner;

public class P1987 {

	static char[][] arr;
	static boolean[][] brr;
	static int Y,X,a[]= {-1,0,1,0},b[]= {0,-1,0,1},max=0;

	static void sol(int y,int x,int sum,String his) {
//		System.out.println(y+" "+x);
		for(int i=0;i<his.length();i++) {
			if(his.charAt(i)==arr[y][x]) return;
		}
		brr[y][x]=true;
		max=max>sum?max:sum;
		for(int i=0;i<4;i++) {
			int ny=y+a[i],nx=x+b[i];
//			System.out.println(ny+" "+nx);
			if(ny>=0&&ny<Y&&nx>=0&&nx<X) {
//				System.out.println("go");
				if(!brr[ny][nx]) sol(ny,nx,sum+1,his+arr[y][x]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Y=s.nextInt();
		X=s.nextInt();
		s.nextLine();
		arr=new char[Y][];
		brr=new boolean[Y][X];
		for(int i=0;i<Y;i++) {
			arr[i]=s.nextLine().toCharArray();
		}
		sol(0,0,1,"");
//		for(int i=0;i<arr.length;i++) System.out.println(Arrays.toString(arr[i]));
//		for(int i=0;i<brr.length;i++) System.out.println(Arrays.toString(brr[i]));
		System.out.println(max);
	}
}
