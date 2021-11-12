package _Algorithm.DFS;
import java.util.Arrays;
import java.util.Scanner;
public class P1068 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][n],r=0,i=0,j;
		for(;i<n;i++) {
			j=s.nextInt();
			if(j>=0)a[j][i]++;
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}
}