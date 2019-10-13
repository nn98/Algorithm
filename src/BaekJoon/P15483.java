package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15483 {
	public static void main(String[]z) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		char[]q=b.readLine().toCharArray(),w=b.readLine().toCharArray();
		if(q.length<w.length) {
			char[]t=q;
			q=w;
			w=t;
		}
		int r=q.length;
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<q.length;j++) {
				if(w[i]==q[j]) {
					q[j]=' ';
					r--;
				}
			}
		}
		System.out.print(r);
	}
}
