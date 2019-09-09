package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1002_3_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int result=0,x1=s.nextInt(),y1=s.nextInt(),r1=s.nextInt(),
					x2=s.nextInt(),y2=s.nextInt(),r2=s.nextInt(),
					size=(x1+r1>y1+r1?x1+r1:y1+r1)>(x2+r2>y2+r2?x2+r2:y2+r2)?(x1+r1>y1+r1?x1+r1:y1+r1):(x2+r2>y2+r2?x2+r2:y2+r2);
			boolean[][] arr=new boolean[++size][size];
			for(int j=0;j<=r1;j++) {
				arr[x1+j][y1+(r1-j)]=true; 
			}
//			for(int j=0;j<arr.length;j++) System.out.println(Arrays.toString(arr[j]));
			for(int j=0;j<=r2;j++) {
				if(arr[x2+j][y2+(r2-j)]) result++; 
			}
			System.out.println(result);
		}
	}

}
