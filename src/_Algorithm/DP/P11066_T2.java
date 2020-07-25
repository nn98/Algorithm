package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;
public class P11066_T2{
	public static void main(String[] args){
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
					System.out.println("j: "+j+" i: "+i+" v: "+h[j][i]);
					h[j][i]=Integer.MAX_VALUE;
					for(k=j-1;k++<i;) {
						System.out.printf("k: %d\th[%d][%d] => %d < h[%d][%d]%d + h[%d][%d]%d ) ? \n",k,j,i,h[j][i],j,k,h[j][k],k+1,i,h[k+1][i]);
						h[j][i]=Math.min(h[j][i],h[j][k]+h[k+1][i]);
					}
					System.out.printf("\th[%d][%d] = %d + %d \n",j,i,h[j][i],u[i]-u[j-1]);
					h[j][i]+=u[i]-u[j-1];
					for(int[]a:h)System.out.println(Arrays.toString(a));
					System.out.println();
				}
			for(i=0;++i<m;h[i][i]=f[i]);
			for(int[]a:h)System.out.println(Arrays.toString(a));
			System.out.println(h[1][m-1]);
		}
	}
}