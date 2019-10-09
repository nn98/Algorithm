package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6064_5 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(int i=Integer.parseInt(r.readLine());i>0;i--) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			int[]a=new int[4];
			for(int j=0;j<4;j++)a[j]=Integer.parseInt(t.nextToken());
			int c=0;
			if(a[0]==a[2]&&a[1]==a[3]) {
				System.out.println(a[0]*a[1]);
				continue;
			}
			while(c++<a[0]*a[1]) {
				if(c%a[0]==a[2]&&c%a[1]==a[3]) {
					System.out.println(c);
					break;
				}
			}
			if(c>a[0]*a[1])System.out.println(-1);
		}
	}
}