package BaekJoon;

import java.util.Scanner;

public class P1915_S {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String[]a=s.nextLine().split(" ");
		int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),i=1,j=1,
				b[][]=new int[n+1][m+1],p=0;
		for(;i<=n;i++) {
			j=1;
			for(String t:s.nextLine().split(""))
			b[i][j++]=Integer.parseInt(t);
		}
//		for(i=0;i<n;i++)System.out.println(Arrays.toString(b[i]));
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				if(b[i][j]==1) {
					b[i][j]=Math.min(b[i-1][j],Math.min(b[i][j-1],b[i-1][j-1]))+1;
					p=p>b[i][j]?p:b[i][j];
				}
			}
		}
		System.out.print(p*p);
	}
}