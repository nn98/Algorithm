package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P11066_T2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j,k,f[],u[],h[][];
		while(n-->0) {
			m=s.nextInt()+1;
			f=new int[m];
			u=new int[m];
			h=new int[m+1][m+1];
			for(i=0;++i<m;f[i]=s.nextInt(),u[i]=f[i]+u[i-1]);
//			System.out.println(Arrays.toString(f));
//			System.out.println(Arrays.toString(u));
			for(i=1;++i<m;)
				for(j=i;--j>0;) {
					h[j][i]=Integer.MAX_VALUE;
					for(k=j-1;k++<i;)h[j][i]=Math.min(h[j][i],h[j][k]+h[k+1][i]);
					h[j][i]+=u[i]-u[j-1];
					System.out.println("i: "+i+" j: "+j);
					for(int[]a:h)System.out.println(Arrays.toString(a));
					System.out.println();
				}
			System.out.println(h[1][m-1]);
		}
	}

}
