package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2508 {

//	static int[] p= {0,1,0,-1},q= {1,0,-1,0};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int n=Integer.parseInt(br.readLine());n>0;n--) {
			int r=0;
			br.readLine();
			char[][] a=new char[Integer.parseInt(br.readLine().substring(0,1))][];
			for(int i=0;i<a.length;i++)a[i]=br.readLine().toCharArray();
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(a[i][j]=='o') {
						try {
							if(a[i-1][j]=='v'&&a[i+1][j]=='^') r++;
						}catch (Exception e) {
							
						}
						try {
							if(a[i][j-1]=='>'&&a[i][j+1]=='<') r++;
						}catch (Exception e) {
							
						}
					}
				}
			}
			System.out.println(r);
		}
	}

}
