package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class P1300_2 {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=s.nextInt(),k=s.nextInt(),i=0,j=0,x=1,y=1,a[][]=new int[n][n];
		for(;x<=n;) {
			a[x-1][y-1]=x*y;
			if(x!=y)a[y-1][x-1]=x*y;
			y++;
			if(y>n) {
				x++;
				y=x;
			}
		}
		for(i=0;i<n;i++)w.write(Arrays.toString(a[i])+"\n");
		w.flush();
	}

}
