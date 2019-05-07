package BaekJoon;

import java.util.Scanner;

public class P1074 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),r=s.nextInt(),c=s.nextInt();
		int a=(int)Math.pow(2,N);
		//int[][] arr=new int[(int)Math.pow(2,N)][(int)Math.pow(2,N)];
		if(N>15) return;
		System.out.println(z(a,r,c));
	}

	public static int z(int a, int r, int c) {
		//System.out.println("a :"+a+" r :"+r+" c :"+c);
		int result=0;
		if(c<0&&r<a) return result;
		if(r<0) return result;
		if (a<2) return result;
		if(a==2) {
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
					if(i==r&&j==c) {
						//System.out.println(result);
						return result;
					}
					result++;
				}
			}
			//System.out.println(result);
			return result;
		}
		return z(a/2,r,c)
				+z(a/2,r,c-a/2)
				+z(a/2,r-a/2,c)
				+z(a/2,r-a/2,c-a/2);
	}

}