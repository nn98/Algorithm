package _Algorithm.DFS;
import java.util.Arrays;
import java.util.Scanner;
public class P1068 {
	static void d(int x) {
		for(int i=0;i<n;i++) {
			if(c[x][i]>0) {
				if(a[i]<1)r--;
				d(i);
			}
		}
		a[p[x]]--;
	}
	static int n,c[][],p[],r,i,j,a[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		c=new int[n][n];
		p=new int[n];
		r=n;
		a=new int[n];
		for(;i<n;i++) {
			j=s.nextInt();
			if(j>=0) {
				p[i]=j;
				c[j][i]++;
				if(a[j]<1)r--;
				a[j]++;
			}
		}
		for(int[]b:c)System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(a));
		System.out.println();
		d(i=s.nextInt());
		for(int[]b:c)System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(a));
		System.out.println(r);
	}
}