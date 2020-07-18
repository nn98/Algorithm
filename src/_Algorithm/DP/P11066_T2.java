package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P11066_T2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j,f[],u[],h[][];
		while(n-->0) {
			m=s.nextInt()+1;
			f=new int[m];
			u=new int[m];
			h=new int[502][502];
			for(i=0;++i<m;f[i]=s.nextInt(),u[i]=f[i]+u[i-1]);
			System.out.println(Arrays.toString(f));
			System.out.println(Arrays.toString(u));
		}
	}

}
