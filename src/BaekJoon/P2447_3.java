package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P2447_3 {

	//GG
	//정사각형으로 생각
	static char[][]a;
	static void sol(int n,int x,int y) {
		if(n==1)a[x][y]='*';
		else {
			int m=n/3;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==1&&j==1)continue;
					sol(m,x+(m*i),y+(m*j));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=s.nextInt();
		a=new char[n][n];
		for(int i=0;i<n;i++)
			Arrays.fill(a[i],' ');
		sol(n,0,0);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				bw.write(a[i][j]);
			bw.newLine();
		}
		bw.flush();
	}

}
