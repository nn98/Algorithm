package _Algorithm.DFS;
import java.util.Arrays;
import java.util.Scanner;
public class P1068 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][n],r=n,i=0,j,c[]=new int[n];
		for(;i<n;i++) {
			j=s.nextInt();
			if(j>=0) {
				a[i][j]++;
				if(c[j]<1)r--;
				c[j]++;
			}
		}
		j=s.nextInt();
		if(c[j]<1)r--;
		else {
			for(i=0;i<n;i++) {
				if(a[i][j]>0)if(c[i]<1)r--;
			}
		}
		System.out.println(r);
	}
}