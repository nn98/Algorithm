package BaekJoon;
import java.util.ArrayList;
//WTF
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class P12972 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][n],i=0,j;
		List<Integer>l=new ArrayList();
		for(;i++<n*n;l.add(s.nextInt()));
		Collections.sort(l);
		System.out.println(l);
//		for(;i<n;i++)for(j=0;j<n;a[i][j++]=s.nextInt());
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}
}