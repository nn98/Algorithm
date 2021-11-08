package _Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class StaticArrayTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],b[][]=new int[n][m],i=0,j;
		for(;i<n;i++)
			for(j=0;j<m;j++)
				a[i][j]=s.nextInt();
		for(i=0;i<n;System.arraycopy(a[i],0,b[i],0,a[i].length),i++);
		
		System.out.println(Arrays.toString(a[2]));
		System.out.println(Arrays.toString(b[2]));
		a[2][4]=555;
		System.out.println(Arrays.toString(a[2]));
		System.out.println(Arrays.toString(b[2]));
	}

}
