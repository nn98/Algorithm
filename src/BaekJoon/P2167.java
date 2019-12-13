package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2167 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],k,x,y,i=-1,j;
		for(;++i<n;)for(j=-1;++j<m;)a[i][j]=s.nextInt();
		for(k=s.nextInt();k-->0;){
			n=0;
			i=s.nextInt()-1;
			j=s.nextInt()-1;
			x=s.nextInt();
			y=s.nextInt();
			for(;i<x;i++)
				for(m=j;m<y;m++)n+=a[i][m];
			System.out.println(n);
		}
	}
}