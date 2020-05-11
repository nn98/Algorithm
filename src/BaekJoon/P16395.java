package _Algorithm;
import java.util.*;
public class P16395 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=31,a[][]=new int[m][m],i=0,j;
		for(;i<m;a[i++][0]=1);
		for(i=1;i<m;i++)
			for(j=1;j<=i;j++)
				a[i][j]=a[i-1][j-1]+a[i-1][j];
		System.out.print(a[s.nextInt()-1][s.nextInt()-1]);
	}
}