package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5525 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 중첩반복문-시간복잡도 급상승
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()),r=0,m=Integer.parseInt(br.readLine()),c=0;
		String t="I";
		for(int i=0;i<n;i++) t+="OI";
		char[] a=br.readLine().toCharArray();
		for(int j=0;j<m-2;j++) {
			if(a[j]=='I') {
				c=0;
				for(int i=j+1;i<m-1;i+=2) {
					if(a[i]=='O'&&a[i+1]=='I') {
						c++;
						if(c==n) {
							r++;
							break;
						}
					}
					else break;
				}
			}
		}
		System.out.println(r);
	}
}