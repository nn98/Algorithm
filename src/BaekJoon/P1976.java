package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1976 {
	
	//아니 시발 95퍼에서 틀리는건 뭐니 개같은거

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		boolean[][] a=new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(s.nextInt()==1) {
//					System.out.println(i+" "+j);
					a[i][j]=true;
					a[j][i]=true;
					for(int k=0;k<a[j].length;k++) {
						if(a[j][k])a[i][k]=true;
					}
					for(int k=0;k<a[i].length;k++) {
						if(a[i][k])a[j][k]=true;
					}
					for(int k=0;k<n;k++) if(a[i][k])a[k][j]=true;
					for(int k=0;k<n;k++) if(a[j][k])a[k][i]=true;
				}
//				if(i==n-1&&j==n-1) {
//					for(int k=0;k<n;k++) if(a[i][k])a[k][j]=true;
//					for(int k=0;k<n;k++) if(a[j][k])a[k][i]=true;
//				}
			}
			
		}
		s.nextLine();
		for(int j=0;j<a.length;j++)System.out.println(Arrays.toString(a[j]));
		String[]b=s.nextLine().split(" ");
		for(int i=1;i<b.length;i++) {
			if(!a[Integer.parseInt(b[i-1])-1][Integer.parseInt(b[i])-1]) {
				System.out.print("NO");
				return;
			}
		}
		System.out.print("YES");
	}
}
/*
5
5
0 1 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
1 2 3 4 5
 */
