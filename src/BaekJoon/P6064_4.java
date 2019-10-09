package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6064_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		for(int i=Integer.parseInt(r.readLine());i>0;i--) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			int[]a=new int[4];
			for(int j=0;j<4;j++)a[j]=Integer.parseInt(t.nextToken());
			int x=1,y=1,c=0;
			while(c++<a[0]*a[1]) {
				if(x==a[2]&&y==a[3]) {
					System.out.println(c);
					break;
				}
				x++;
				y++;
				if(x>a[0])x=1;
				if(y>a[1])y=1;
			}
			if(c>a[0]*a[1])System.out.println(-1);
		}
	}

}
