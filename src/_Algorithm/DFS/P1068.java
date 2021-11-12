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
		for(int[]b:a)System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(r);
		j=s.nextInt();
		
	}
}