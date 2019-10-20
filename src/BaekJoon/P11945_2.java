package BaekJoon;

import java.util.Scanner;

public class P11945_2 {
	//시발 런타임에러 뭐나는지만 알려줘도 알아먹겠는데 존나 에러임 ㅅㄱ ㅇㅈㄹ
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]in=s.nextLine().split(" ");
		int n=Integer.parseInt(in[0]),m=Integer.parseInt(in[1]),a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			in=s.nextLine().split("");
			for(int j=0;j<m;j++)
				a[i][j]=Integer.parseInt(in[j]);
		}
		for(int i=0;i<n;i++) {
			for(int j=m-1;j>=0;j--)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}