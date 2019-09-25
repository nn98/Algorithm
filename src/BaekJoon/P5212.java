package BaekJoon;

import java.util.*;

public class P5212{
	static int[]a={-1,0,1,0},b={0,-1,0,1};
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String[][] arr=new String[s.nextInt()][s.nextInt()],brr=new String[arr.length][arr[0].length];
		s.nextLine();
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextLine().split("");
			Arrays.fill(brr[i],".");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j].equals("X")) {
					int c=0;
				for(int k=0;k<4;k++) {
					if(i+a[k]>=0&&i+a[k]<arr.length&&j+b[k]>=0&&j+b[k]<arr[i].length) {
						if(arr[i+a[k]][j+b[k]].equals(".")) c++;
					}
					else c++;
				}
				if(c>2) brr[i][j]=".";
				else brr[i][j]="X";
				}
			}
		}
		int un=Integer.MAX_VALUE,in=Integer.MIN_VALUE,f=-1,t=-1;
		boolean[] c=new boolean[arr.length];
 		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(brr[i][j].equals("X")) {
					if(f==-1) {
						f=i;
						t=i;
					}
					else t=i;
					un=un<j?un:j;
					in=in>j?in:j;
				}
			}
		}
 		for(int i=f;i<=t;i++){
 			for(int j=un;j<=in;j++)
 				System.out.print(brr[i][j]);
 			System.out.println();
 		}
	}

}
//	System.out.println(un+" "+in+" "+f+" "+t);
//	for(int i=0;i<brr.length;i++) {
//		for(int j=0;j<brr[i].length;j++)
//			System.out.print(brr[i][j]);
//		System.out.println();
//	}
/*
3 10
...XXX...X
..XXX.XXX.
XXX.......
*/