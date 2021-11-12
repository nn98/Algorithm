package _Algorithm.DFS;
import java.util.Arrays;
import java.util.Scanner;
public class P1068 {
	static void d(int x) {
		if(a[x]>0){
			for(int i=0;i<n;i++) {
				if(c[x][i]>0) {
					d(i);
				}
			}
		}
		a[x]=9;
	}
	static int n,c[][],p[],r,i,j,a[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		c=new int[n][n];
		p=new int[n];
		a=new int[n];
		for(;i<n;i++) {
			j=s.nextInt();
			if(j>=0) {
				p[i]=j;
				c[j][i]++;
				a[j]++;
			}
		}
//		for(int[]b:c)System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(p));
//		System.out.println(Arrays.toString(a));
		System.out.println();
		d(i=s.nextInt());
		a[p[i]]--;
//		for(int[]b:c)System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(p));
//		System.out.println(Arrays.toString(a));
		for(int b:a)r+=b<1?1:0;
		System.out.println(r);
	}
}