package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P6221 {
	static int n,m,i,r,j,a[][],h[],v[];
	static int o(int x,int c) {
		v[x]++;
//		System.out.println(x+" "+a[x][0]+" "+a[i][1]);
		for(int i=0;i<c;i++,System.out.print("\t"));
		System.out.println(x+" "+c);
		for(int i=0;i<n;i++) {
//			System.out.println(String.format("\t%d %d", a[i][0],a[i][1]));
			if(v[i]<1&a[i][0]>a[x][0]&a[i][1]>a[x][1]) {
//				System.out.println("In");
//				h[x]=Math.max(h[x],h[i]);
//				h[x]=Math.max(o(i,c+1),h[x]);
				o(i,c+1);
			}
		}
		h[x]=h[x]>c?h[x]:c;
		for(int i=0;i<c;i++,System.out.print("\t"));
//		System.out.println("re: "+c);
		System.out.println(Arrays.toString(h));
		r=r>h[x]?r:h[x];
		v[x]--;
		return h[x];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][2];
		h=new int[n];
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=s.nextInt());
		for(;i-->0;v=new int[n],o(i,1));
//		System.out.println(Arrays.toString(h));
		System.out.println(r);
	}

}
