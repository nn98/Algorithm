package BaekJoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1238 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),x=s.nextInt(),a[][]=new int[n][n];
		StringTokenizer st;
		s.nextLine();
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(s.nextLine());
			a[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=Integer.parseInt(st.nextToken());
			
		}
	}
}