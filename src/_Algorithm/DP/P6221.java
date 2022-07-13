package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P6221 {
	static int n,m,i,r,j,a[][],h[];
	static int o(int x,int v) {
//		System.out.println(x+" "+a[x][0]+" "+a[i][1]);
		for(int i=0;i<n;i++) {
//			System.out.println(String.format("\t%d %d", a[i][0],a[i][1]));
			if(a[i][0]>a[x][0]&a[i][1]>a[x][1]) {
//				System.out.println("In");
//				h[x]=Math.max(h[x],h[i]);
				h[x]=Math.max(o(i,v+1),h[x]);
			}
		}
		h[x]++;
		r=r>h[x]?r:h[x];
		return h[x];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][2];
		h=new int[n];
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=s.nextInt());
		for(;i-->0;o(i,0));
		System.out.println(Arrays.toString(h));
	}

}
